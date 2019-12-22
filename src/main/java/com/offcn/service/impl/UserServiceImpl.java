package com.offcn.service.impl;

import com.offcn.pojo.User;
import com.offcn.repository.UserRepository;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);

    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void update(User user) {
userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.findById(id).get();
    }
}
