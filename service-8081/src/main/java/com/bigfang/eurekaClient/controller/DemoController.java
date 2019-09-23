package com.bigfang.eurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/9/23 18:09
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class DemoController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
