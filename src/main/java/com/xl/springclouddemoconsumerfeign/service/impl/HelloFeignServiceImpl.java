package com.xl.springclouddemoconsumerfeign.service.impl;

import com.xl.springclouddemoconsumerfeign.service.HelloFeignService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloFeignServiceImpl
 * @Description springcloud消费测试实现类
 * @Author xule
 * @Date 2019/2/13 11:09
 * @Version 1.0
 **/
@Service
public class HelloFeignServiceImpl implements HelloFeignService {
    @Override
    public String helloWorldFeignConsumer() {
        return "this message from hystrix";
    }
}
