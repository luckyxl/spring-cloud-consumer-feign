package com.xl.springclouddemoconsumerfeign.service;

import com.xl.springclouddemoconsumerfeign.service.impl.HelloFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloFeignService
 * @Description springcloud消费测试类, feign方式
 * @Author xule
 * @Date 2019/2/12 14:20
 * @Version 1.0
 **/
@FeignClient(value = "SPRINGCLOUDDEMOSERVICE",fallback = HelloFeignServiceImpl.class)
public interface HelloFeignService {

    @GetMapping("/hello/helloworld")
    String helloWorldFeignConsumer();

    @PostMapping("/schoolUser/add")
    String add(@RequestParam("schoolName") String schoolName, @RequestParam("userName")String userName);
    @PostMapping("/schoolUser/update")
    String update(@RequestParam("schoolId")Integer schoolId,
                  @RequestParam("schoolName")String schoolName,
                  @RequestParam("userId")Integer userId,
                  @RequestParam("userName")String userName);
}
