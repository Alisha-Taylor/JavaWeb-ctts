package com.gzu.ctts.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gzu.ctts.entity.SysUser;
import com.gzu.ctts.mapper.SysUserMapper;
import com.gzu.ctts.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SysUserServiceImpl implements SysUserService {

    private final SysUserMapper sysUserMapper;   // 注入 BaseMapper

    @Override
    public SysUser add(SysUser user) {
        sysUserMapper.insert(user);
        return user;
    }

    @Override
    public boolean delete(Long id) {
        return sysUserMapper.deleteById(id) > 0;
    }

    @Override
    public boolean update(SysUser user) {
        return sysUserMapper.updateById(user) > 0;
    }

    @Override
    public SysUser getById(Long id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public List<SysUser> list() {
        return sysUserMapper.selectList(null);
    }

    @Override
    public IPage<SysUser> page(long current, long size) {
        return sysUserMapper.selectPage(new Page<>(current, size), null);
    }
}