package com.coolyk.coolmall.service.impl;

import com.coolyk.coolmall.entity.TbBrand;
import com.coolyk.coolmall.mapper.TbBrandMapper;
import com.coolyk.coolmall.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        List<TbBrand> list = tbBrandMapper.findAll();
        return list;
    }
}
