package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {
    void delete(Integer id);

    void save(User user);

    void update(User user);

    List<User> findAll();

    User findOne(Integer id);
}
