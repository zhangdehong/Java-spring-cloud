package com.hong.spring.config;

import com.hong.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  10:12 下午 2021/8/15
 */
@ComponentScan
public class Config {

    @Bean
    public User user () {
        return new User();
    }
}
