package com.dkm.qlda.taskservice.service;

import com.dkm.qlda.taskservice.collection.Task;
import com.dkm.qlda.taskservice.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService implements BaseService<Task, String>{

    private TaskRepository taskRepository;
    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
