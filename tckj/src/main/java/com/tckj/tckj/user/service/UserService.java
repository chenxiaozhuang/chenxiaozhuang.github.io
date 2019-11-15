package com.tckj.tckj.user.service;

import com.tckj.tckj.user.entity.User;

public interface UserService {
    public User findUserByName(String name);
    public User findUserById(Integer id);
}
