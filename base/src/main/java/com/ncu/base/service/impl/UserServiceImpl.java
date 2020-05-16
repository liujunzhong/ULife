package com.ncu.base.service.impl;

import com.ncu.base.dao.UserDao;
import com.ncu.base.entity.User;
import com.ncu.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        System.out.println("dateString: " + dateString);
        user.setGmtUpdated(date);
        userDao.updateUser(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }
}
