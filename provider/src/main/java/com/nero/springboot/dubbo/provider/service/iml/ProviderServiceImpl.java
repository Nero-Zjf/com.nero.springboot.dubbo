package com.nero.springboot.dubbo.provider.service.iml;

import org.apache.dubbo.config.annotation.Service;
import com.nero.springboot.dubbo.service.ProviderService;

/**
 * xml方式服务提供者实现类
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    public String SayHello(String word) {
        System.out.println("消费者调用");
        return word;
    }
}