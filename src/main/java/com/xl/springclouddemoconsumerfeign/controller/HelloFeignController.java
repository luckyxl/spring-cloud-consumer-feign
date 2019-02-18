package com.xl.springclouddemoconsumerfeign.controller;

import com.xl.springclouddemoconsumerfeign.service.HelloFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloFeignController
 * @Description TODO
 * @Author xule
 * @Date 2019/2/12 14:24
 * @Version 1.0
 **/
@RestController
@RequestMapping("/helloconsumerfeign")
public class HelloFeignController {
    @Resource
    private HelloFeignService helloFeignService;
    @GetMapping("/helloworld")
    public String helloWorld(){
        return helloFeignService.helloWorldFeignConsumer();
    }
}
