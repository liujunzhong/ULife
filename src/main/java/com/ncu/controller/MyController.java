package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bbb")
public class MyController {

    @GetMapping("/aaa")
    public String testController(){
        System.out.println("Test Controller");
        return "success";
    }
}
