package com.coolyk.coolmall.controller;

import com.coolyk.coolmall.entity.TbBrand;
import com.coolyk.coolmall.service.BrandService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    @Lazy
    BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }
}