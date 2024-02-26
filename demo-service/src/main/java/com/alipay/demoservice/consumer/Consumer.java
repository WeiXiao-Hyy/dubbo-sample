package com.alipay.demoservice.consumer;

import com.alipay.demoapi.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author hyy
 * @Description
 * @create 2024-02-26 19:47
 */

@Component
public class Consumer implements CommandLineRunner {

    @DubboReference
    private DemoService demoService;

    public void run(String... args) throws Exception {
        String result = demoService.sayHello("hjl");
        System.out.println("receive message: " + result);
    }
}