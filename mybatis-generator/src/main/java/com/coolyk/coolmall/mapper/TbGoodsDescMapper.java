package com.coolyk.coolmall.mapper;

import com.coolyk.coolmall.entity.TbGoodsDesc;

public interface TbGoodsDescMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoodsDesc record);

    int insertSelective(TbGoodsDesc record);

    TbGoodsDesc selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(TbGoodsDesc record);

    int updateByPrimaryKey(TbGoodsDesc record);
}