package com.hong.controller;

import com.hong.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  8:54 下午 2021/3/27
 */
@RestController
public class ConfigController {

    @Value("${server.port:8080}")
    private int port;
    @Autowired
    private Environment env;

    @Autowired
    private User user;

    @GetMapping("/config")
    public Object config () {
        Map<String, Object> map = new HashMap<>();
        map.put("port", port);
        map.put("profile", env.getProperty("spring.profiles.active"));
        map.put("user", user.getName());
        return map;
    }
}
