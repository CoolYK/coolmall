package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    List<TbBrand> findAll();
}