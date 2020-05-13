package com.ncu.base.controller;

import com.ncu.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
@RequestMapping("label")
public class LabelController {

    @PostMapping("createLabel")
    public Result createLabel(@RequestBody Label label){


        return new Result();
    }
}
