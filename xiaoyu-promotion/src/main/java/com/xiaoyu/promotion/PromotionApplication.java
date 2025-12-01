package com.xiaoyu.promotion;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 促销服务启动类
 * @author admin
 */
@SpringBootApplication
@EnableDubbo
public class PromotionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PromotionApplication.class, args);

        String serverAddr = context.getEnvironment().getProperty("spring.cloud.nacos.discovery.server-addr");
        System.out.println("===================================================");
        System.out.println(">>> Promotion Server Address: " + serverAddr);
        System.out.println(">>> Application Name: " + context.getEnvironment().getProperty("spring.application.name"));
        System.out.println(">>> Server Port: " + context.getEnvironment().getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  " + context.getEnvironment().getProperty("spring.application.name") + " is running 启动成功   ლ(´ڡ`ლ)");
        System.out.println("===================================================");
    }
}
