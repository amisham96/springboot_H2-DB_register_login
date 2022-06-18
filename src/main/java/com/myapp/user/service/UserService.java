package com.myapp.user.service;

import org.springframework.stereotype.Service;

import com.myapp.user.entity.User;

@Service
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
