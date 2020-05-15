package com.ncu.base.controller;

import com.ncu.base.entity.Label;
import com.ncu.base.service.LabelService;
import com.ncu.entity.Result;
import com.ncu.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("label")
public class LabelController {

    @Autowired
    LabelService labelService;

    @PostMapping("createLabel")
    public Result createLabel(@RequestBody Label label){ // @RequestBody 将请求的json字符串映射成Label对象
        System.out.println("createlabel");
        labelService.createLabel(label);
        return new Result(true, StatusCode.OK,"标签创建成功");
    }

    @DeleteMapping("/deleteLabel")  // sparing boot 2.2.2 URL中带特定参数@DeleteMapping("/deleteLabel/{id}")不用再这样写了,
                                    // 直接这样就行@DeleteMapping("/deleteMapping"),在方法的参数上要和参数名一样。
    public Result deleteLabel(String id){
        labelService.deleteLabel(id);
        return new Result(true,StatusCode.OK,"标签删除成功");
    }

    @PutMapping("/updateLabel")
    public Result updateLabel(@RequestBody Label label){
        labelService.updateLabel(label);
        return new Result(true,StatusCode.OK,"更新成功");
    }
    @GetMapping("/getAllLabel")
    public Result selectAllLabel(){
        List<Label> labels = labelService.selectAllLabel();
        return new Result(true,StatusCode.OK,"查询成功",labels);

    }

}
