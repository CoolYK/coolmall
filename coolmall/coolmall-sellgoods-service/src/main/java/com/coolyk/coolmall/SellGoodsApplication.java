package com.coolyk.coolmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.coolyk.coolmall.mapper")
public class SellGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellGoodsApplication.class, args);
    }
}
