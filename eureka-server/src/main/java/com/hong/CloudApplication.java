package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:24 上午 2021/3/30
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudApplication {

    public static void main (String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
}
