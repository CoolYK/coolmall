package com.coolyk.coolmall.service;

import com.coolyk.coolmall.entity.TbBrand;
import entity.PageResult;

import java.util.List;

public interface BrandService {

    /**
     *
     * @param pageNum 页码
     * @param pageSize 每页数据量
     * @return 品牌数据集合
     */
    PageResult findPage(int pageNum, int pageSize);

    void addBrand(TbBrand brand);

    void updateBrand(TbBrand brand);

    TbBrand findOne(Long id);

    void delete(Long[] ids);

    PageResult searchBrands(String name, String firstChar, int pageNum, int pageSize);
}
