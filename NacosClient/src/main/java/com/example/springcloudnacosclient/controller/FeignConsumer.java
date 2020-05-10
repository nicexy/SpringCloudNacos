package com.example.springcloudnacosclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yu Xiao
 * @Date: 2020/5/10 17:29
 */
@RestController
@FeignClient(name = "alibaba-nacos-discovery-server")
public interface FeignConsumer {
    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
