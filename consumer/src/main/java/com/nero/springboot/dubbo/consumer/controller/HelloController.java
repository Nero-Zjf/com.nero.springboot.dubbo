package com.nero.springboot.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nero.springboot.dubbo.service.ProviderService;

@RestController
public class HelloController {

    @Reference(url = "dubbo://192.168.1.158:20880/service.ProviderService")//使用点对点方式
    //@Reference //使用zookeeper注册中心的方式
    private ProviderService providerService;

    /**
     * 获取指定机器人的直播拉流地址
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return providerService.SayHello("hello");
    }

}
