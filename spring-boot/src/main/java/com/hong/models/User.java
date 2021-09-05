package com.hong.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  8:57 下午 2021/3/27
 */
@Configuration
@ConfigurationProperties(prefix="spring")
public class User {

    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
