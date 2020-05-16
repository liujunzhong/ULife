package com.ncu.base.controller;

import com.ncu.base.entity.User;
import com.ncu.base.service.UserService;
import com.ncu.entity.Result;
import com.ncu.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("insertUser")
    public Result insertUser(@RequestBody User user){
        userService.insertUser(user);
        return new Result(true,StatusCode.OK,"插入成功");
    }
    @DeleteMapping("deleteUser")
    public Result deleteUser(String id){
        userService.deleteUser(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }
    @PutMapping("updateUser")
    public Result updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new Result(true,StatusCode.OK,"插入成功");
    }


    @GetMapping("selectAllUser")
    public Result selectAllUser(){
        return new Result(true, StatusCode.OK,"查询成功",userService.selectAllUser());
    }
}
