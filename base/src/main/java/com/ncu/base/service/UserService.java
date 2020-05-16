package com.ncu.base.service;

import com.ncu.base.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void insertUser(User user);

    void deleteUser(String id);

    void updateUser(User user);

    List<User> selectAllUser();
}
