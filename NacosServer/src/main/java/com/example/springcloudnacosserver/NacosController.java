package com.example.springcloudnacosserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yu Xiao
 * @Date: 2020/5/10 13:41
 */
@RestController
@Slf4j
public class NacosController {
    @Value("${ming.name}")
    private String msg;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name + msg;
    }
}
