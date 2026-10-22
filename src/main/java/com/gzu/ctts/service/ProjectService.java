package com.gzu.ctts.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gzu.ctts.entity.TrainProject;
import java.util.List;

public interface ProjectService {
    TrainProject addProject(TrainProject project);
    boolean deleteProject(Long id);
    boolean updateProject(TrainProject project);
    TrainProject getById(Long id);
    List<TrainProject> listAll();
    IPage<TrainProject> page(long current, long size);
}