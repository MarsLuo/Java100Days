package com.marsluo.spring2.service;

import com.marsluo.spring2.model.User;

import java.util.List;

public interface UserService {
    int create(String name, Integer age);
    List<User> getByName(String name);
    List<User> getAllUsers();
    int deleteByName(String name);
    int deleteAllUsers();
}
