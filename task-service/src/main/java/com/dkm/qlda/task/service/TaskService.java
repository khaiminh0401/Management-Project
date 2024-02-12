package com.dkm.qlda.task.service;

import com.dkm.qlda.common.collection.Task;
import com.dkm.qlda.common.service.BaseService;
import com.dkm.qlda.task.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService implements BaseService<Task, String> {

    private TaskRepository taskRepository;
    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> findAllById(String id) {
        return null;
    }

    @Override
    public int save(Task object) {
        return taskRepository.save(object) == null ? 1:0;
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }
}
