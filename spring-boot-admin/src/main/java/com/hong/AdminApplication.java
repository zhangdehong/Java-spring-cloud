package com.hong;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:55 上午 2021/3/29
 */
@EnableAdminServer
@SpringBootApplication
public class AdminApplication {

    public static void main (String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
