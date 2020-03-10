package com.github.git_leon.service;

import com.github.git_leon.model.Task;
import com.github.git_leon.repository.TaskRepository;
import com.github.git_leon.utils.AbstractSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author leonhunter
 * @created 03/09/2020 - 5:45 PM
 */
@Service
public class TaskService extends AbstractSimpleService<Long, Task, TaskRepository> {
    public TaskService(TaskRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public Task update(Long id, Task newEntityData) {
        Task taskToBeUpdated = super.findById(id);
        Assert.notNull(taskToBeUpdated, "Task not found");
        taskToBeUpdated.setDescription(newEntityData.getDescription());
        getRepository().save(taskToBeUpdated);
        return taskToBeUpdated;
    }
}
