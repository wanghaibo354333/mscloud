package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wanghaibo
 * @create 2020-07-04 23:07
 */
@EnableEurekaClient
@SpringBootApplication
public class Payment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002Application.class,args);
    }
}
