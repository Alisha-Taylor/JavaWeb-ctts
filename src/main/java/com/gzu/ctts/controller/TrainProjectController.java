package com.gzu.ctts.controller;

import com.gzu.ctts.common.Result;
import com.gzu.ctts.entity.TrainProject;
import com.gzu.ctts.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class TrainProjectController {

    private final ProjectService projectService;

    /** 新增 */
    @PostMapping
    public Result add(@RequestBody TrainProject project) {
        return Result.success(projectService.addProject(project));
    }

    /** 删除 */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(projectService.deleteProject(id));
    }

    /** 修改 */
    @PutMapping
    public Result update(@RequestBody TrainProject project) {
        return Result.success(projectService.updateProject(project));
    }

    /** 按 id 查询 */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id) {
        return Result.success(projectService.getById(id));
    }

    /** 查询全部 */
    @GetMapping
    public Result listAll() {
        return Result.success(projectService.listAll());
    }

    /** 分页查询 */
    @GetMapping("/page")
    public Result page(@RequestParam(defaultValue = "1") long current,
                       @RequestParam(defaultValue = "5") long size) {
        return Result.success(projectService.page(current, size));
    }
}