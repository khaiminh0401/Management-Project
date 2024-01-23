package com.dkm.qlda.taskservice.repository;

import com.dkm.qlda.taskservice.collection.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
