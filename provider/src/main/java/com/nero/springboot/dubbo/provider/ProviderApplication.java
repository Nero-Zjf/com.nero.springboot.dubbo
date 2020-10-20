package com.nero.springboot.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableDubbo  //会扫描所有的包，从中找出dubbo的@Service标注的类
// @DubboComponentScan(basePackages = "com.chy.user-service.service")  //只扫描指定的包，同application.properties中设置dubbo.scan.base-packages
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
