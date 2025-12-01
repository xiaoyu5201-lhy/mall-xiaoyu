package com.xiaoyu.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @description: 订单服务启动类
 * @author: 苟于晓
 * @time: 2025/9/16
 */
@SpringBootApplication
@EnableDubbo
public class OrderApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(OrderApplication.class, args);

        String serverAddr = context.getEnvironment().getProperty("spring.cloud.nacos.discovery.server-addr");
        System.out.println("===================================================");
        System.out.println(">>> Order Server Address: " + serverAddr);
        System.out.println(">>> Application Name: " + context.getEnvironment().getProperty("spring.application.name"));
        System.out.println(">>> Server Port: " + context.getEnvironment().getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  " + context.getEnvironment().getProperty("spring.application.name") + " is running 启动成功   ლ(´ڡ`ლ)");
        System.out.println("===================================================");
    }
}