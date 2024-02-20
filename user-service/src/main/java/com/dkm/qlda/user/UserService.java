package com.dkm.qlda.user;

import com.dkm.qlda.common.collection.User;
import com.dkm.qlda.common.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements BaseService<User,String> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> findAllById(String id) {
        return null;
    }

    @Override
    public int save(User object) {
        return 0;
    }

    @Override
    public void delete(String id) {

    }
}
