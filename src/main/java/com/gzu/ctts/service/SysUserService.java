package com.gzu.ctts.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gzu.ctts.entity.SysUser;
import java.util.List;

public interface SysUserService {
    SysUser add(SysUser user);
    boolean delete(Long id);
    boolean update(SysUser user);
    SysUser getById(Long id);
    List<SysUser> list();
    IPage<SysUser> page(long current, long size);
}