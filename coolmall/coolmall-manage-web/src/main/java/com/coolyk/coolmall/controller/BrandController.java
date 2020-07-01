package com.coolyk.coolmall.controller;

import com.coolyk.coolmall.entity.TbBrand;
import com.coolyk.coolmall.service.BrandService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.*;
import org.apache.dubbo.config.annotation.Reference;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    BrandService brandService;

    @GetMapping("/brandList")
    public PageResult getBrandList(int page, int size) {
        return brandService.findPage(page, size);
    }

    @PostMapping("/add")
    public Result add(@RequestBody TbBrand brand) {
        try {
            brandService.addBrand(brand);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }
}
