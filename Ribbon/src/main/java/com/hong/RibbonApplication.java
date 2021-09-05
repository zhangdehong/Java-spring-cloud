package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:27 上午 2021/4/12
 */
@EnableEurekaClient
@SpringBootApplication
public class RibbonApplication {

    public static void main (String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }
}
