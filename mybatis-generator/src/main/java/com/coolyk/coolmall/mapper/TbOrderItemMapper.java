package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbOrderItem;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    TbOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}