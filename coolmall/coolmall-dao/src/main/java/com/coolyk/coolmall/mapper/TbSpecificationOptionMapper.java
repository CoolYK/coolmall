package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbSpecificationOption;

public interface TbSpecificationOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);
}