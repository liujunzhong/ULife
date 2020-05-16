package com.ncu.base.dao;

import com.ncu.base.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    void insertUser(User user);

    void deleteUser(String id);

    void updateUser(User user);

    List<User> selectAllUser();

}
