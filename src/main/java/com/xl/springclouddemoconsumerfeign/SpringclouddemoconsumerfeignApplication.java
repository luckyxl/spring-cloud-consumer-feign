package com.xl.springclouddemoconsumerfeign;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDistributedTransaction
public class SpringclouddemoconsumerfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoconsumerfeignApplication.class, args);
    }

}

