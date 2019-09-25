package com.xl.springclouddemoconsumerfeign.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xl.springclouddemoconsumerfeign.service.HelloFeignService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SchoolUserController
 * @Description TODO
 * @Author xule
 * @Date 2019/9/24 16:09
 * @Version 1.0
 **/
@RestController
@RequestMapping("/schoolUserconsumerfeign")
public class SchoolUserController {
    @Resource
    private HelloFeignService helloFeignService;

    @PostMapping("/addAndUpdate")
    @LcnTransaction
    public String addAndUpdate(){
        String userName = "张三";
        String schoolName = "清华大学";
        helloFeignService.add(schoolName, userName);
        helloFeignService.update(3, "北京大学", 3, "李四");
//        int a = 1/0;
        return "success";
    }


}
