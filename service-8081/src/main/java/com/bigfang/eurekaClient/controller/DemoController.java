package com.bigfang.eurekaClient.controller;

import com.bigfang.eurekaClient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private HelloService helloService;
    
    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        System.out.println("request is coming...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("线程被打断... " + e.getMessage());
        }
        return helloService.hello();
    }
}
