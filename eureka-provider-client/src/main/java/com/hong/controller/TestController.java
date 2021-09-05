package com.hong.controller;

import com.hong.indicator.CustomHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  10:47 下午 2021/3/31
 */
@RestController
public class TestController {

    private final CustomHealthIndicator customHealthIndicator;

    @Autowired
    public TestController (CustomHealthIndicator customHealthIndicator) {this.customHealthIndicator = customHealthIndicator;}

    @GetMapping("/update/status")
    public String updateStatus (boolean status) {
        customHealthIndicator.setStatus(status);
        return "SUCCESS";
    }

    public static void main (String[] args) {
        String a = "00000000000011010000000000000000";
        int b = Integer.parseInt(a,2);
        System.out.println(b);

        HashMap<Integer, String> map = new HashMap<>(4);
        map.put(1,"1.1");
        map.put(5,"2.5");
        map.put(9,"3.9");
        map.put(13,"4.13");
        map.put(17,"5.17");
        map.put(21,"6.21");
        System.out.println(map.size());
    }
}
