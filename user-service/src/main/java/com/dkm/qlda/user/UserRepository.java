package com.dkm.qlda.user;

import com.dkm.qlda.common.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
