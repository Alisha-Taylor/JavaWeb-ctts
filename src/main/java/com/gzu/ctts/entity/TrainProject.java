package com.gzu.ctts.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@TableName("training_project")
public class TrainProject {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String projectName;
    private String description;
    private Long teacherId;


    @TableField("start_date")
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer status;
}