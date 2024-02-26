package com.alipay.demoservice.service;

import com.alipay.demoapi.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hyy
 * @Description
 * @create 2024-02-26 19:29
 */

@DubboService
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello: " + name;
    }
}