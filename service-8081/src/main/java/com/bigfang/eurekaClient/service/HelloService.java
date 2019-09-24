package com.bigfang.eurekaClient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/9/24 14:07
 * @Version 1.0
 **/
@Service
public class HelloService {
    @HystrixCommand(fallbackMethod = "helloException")
    public String hello() throws InterruptedException {
        //TimeUnit.SECONDS.sleep(10);
        return "hello 8081";
    }
    
    public String helloException(){
        return getClass().getSimpleName() + " exception";
    }
}
