package com.hong.controller;

import com.hong.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:12 上午 2021/4/12
 */
@RestController
public class UserController {

    @GetMapping("/user/get")
    public User getUser (int id) {
        return new User(id, "hong");
    }
}
