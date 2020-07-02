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

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand, int page, int size) {
        return brandService.searchBrands(brand.getName(), brand.getFirstChar(), page, size);
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

    @PostMapping("/update")
    public Result update(@RequestBody TbBrand brand) {
        try {
            brandService.updateBrand(brand);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    @RequestMapping("/find")
    public TbBrand find(Long id) {
        return brandService.findOne(id);
    }

    @RequestMapping("/delete")
    public Result delete(Long[] ids) {
        try {
            brandService.delete(ids);
            return new Result(true, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "操作失败");
        }
    }
}
