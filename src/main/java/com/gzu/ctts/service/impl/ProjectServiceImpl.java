package com.gzu.ctts.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gzu.ctts.entity.TrainProject;
import com.gzu.ctts.mapper.TrainProjectMapper;
import com.gzu.ctts.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final TrainProjectMapper projectMapper;

    @Override
    public TrainProject addProject(TrainProject project) {
        projectMapper.insert(project);          // 自增主键会回填到 project.id
        return project;
    }

    @Override
    public boolean deleteProject(Long id) {
        return projectMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateProject(TrainProject project) {
        return projectMapper.updateById(project) > 0;
    }

    @Override
    public TrainProject getById(Long id) {
        return projectMapper.selectById(id);
    }

    @Override
    public List<TrainProject> listAll() {
        return projectMapper.selectList(null);   // null 表示无条件，查全部
    }

    @Override
    public IPage<TrainProject> page(long current, long size) {
        return projectMapper.selectPage(new Page<>(current, size), null);
    }
}