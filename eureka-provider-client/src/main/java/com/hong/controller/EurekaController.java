package com.hong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  9:59 下午 2021/3/31
 */
@RestController
public class EurekaController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public EurekaController (DiscoveryClient discoveryClient) {this.discoveryClient = discoveryClient;}

    /**
     * 获取Eureka中的所有实例信息
     *
     * @return
     */
    @GetMapping(value = "/instance")
    public List<ServiceInstance> getApplications () {
        List<ServiceInstance> instances = discoveryClient.getServices().stream()
                .map(sid -> discoveryClient.getInstances(sid))
                .collect(Collectors.toList())
                .stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        return instances;
    }
}
