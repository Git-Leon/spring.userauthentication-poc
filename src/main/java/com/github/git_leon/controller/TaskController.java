package com.github.git_leon.controller;

import com.github.git_leon.model.Task;
import com.github.git_leon.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void create(@RequestBody Task task) {
        taskService.create(task);
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Task task) {
        taskService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        taskService.deleteById(id);
    }
}