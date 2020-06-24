package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbTypeTemplate;

public interface TbTypeTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    TbTypeTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);
}