package com.gzu.ctts.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("sys_user")                    // 映射表名
public class SysUser {

    @TableId(type = IdType.AUTO)          // 主键，自增
    private Long id;

    private String username;              // 字段名与列名一致时无需 @TableField
    private String password;
    private String realName;              // 驼峰自动转下划线 real_name
    private String role;
    private LocalDateTime createTime;
}