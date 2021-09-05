package com.hong;

import com.hong.user.first.EnableUserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>spring boot 启动类</h1>
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  7:39 下午 2021/3/27
 */
@EnableUserClient
@SpringBootApplication
public class MainApplication {

    public static void main (String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
