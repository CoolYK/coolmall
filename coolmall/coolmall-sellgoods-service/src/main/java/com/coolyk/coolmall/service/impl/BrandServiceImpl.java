package com.coolyk.coolmall.service.impl;

import com.coolyk.coolmall.entity.TbBrand;
import com.coolyk.coolmall.mapper.TbBrandMapper;
import com.coolyk.coolmall.service.BrandService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@Service
public class BrandServiceImpl implements BrandService {

    TbBrandMapper tbBrandMapper;

    @Autowired
    public void setTbBrandMapper(TbBrandMapper tbBrandMapper) {
        this.tbBrandMapper = tbBrandMapper;
    }

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.findAll();
    }
}
