package com.hong.controller;

import com.hong.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:21 上午 2021/4/12
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public User getUser () {
        User user = restTemplate.getForEntity("http://user-service/user/get?id=1", User.class).getBody();
        return user;
    }
}
