package com.coolyk.coolmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class SellGoodsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellGoodsWebApplication.class, args);
    }
}
