package com.hong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  7:43 下午 2021/3/27
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello () {
        return "Hello Spring Boot Start";
    }
}
