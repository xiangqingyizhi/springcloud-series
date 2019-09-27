package com.practice.springcloud.operatedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OperateDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(OperateDbApplication.class, args);
    }

}
