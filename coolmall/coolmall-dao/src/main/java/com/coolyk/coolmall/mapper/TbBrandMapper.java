package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbBrand;

import java.util.List;

public interface TbBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    List<TbBrand> findAll();
}