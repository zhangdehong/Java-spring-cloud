package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  10:41 下午 2021/3/30
 */
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {

    public static void main (String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
