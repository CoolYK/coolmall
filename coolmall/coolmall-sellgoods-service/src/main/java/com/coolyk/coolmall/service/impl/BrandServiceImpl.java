package com.coolyk.coolmall.service.impl;

import com.coolyk.coolmall.entity.TbBrand;
import com.coolyk.coolmall.mapper.TbBrandMapper;
import com.coolyk.coolmall.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
@Service
public class BrandServiceImpl implements BrandService {

    TbBrandMapper tbBrandMapper;

    @Autowired
    public void setTbBrandMapper(TbBrandMapper tbBrandMapper) {
        this.tbBrandMapper = tbBrandMapper;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.findAll();
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void addBrand(TbBrand brand) {
        tbBrandMapper.insert(brand);
    }
}
