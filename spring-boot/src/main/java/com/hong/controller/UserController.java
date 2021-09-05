package com.hong.controller;

import com.hong.user.first.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:23 上午 2021/3/28
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/get/username")
    public String getUsername () {
        return userClient.getName();
    }
}
