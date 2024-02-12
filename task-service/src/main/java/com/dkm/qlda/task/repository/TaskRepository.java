package com.dkm.qlda.task.repository;

import com.dkm.qlda.common.collection.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
