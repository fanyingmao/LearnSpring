package com.fym.learnspring.mapper;

import com.fym.learnspring.po.ItemsCustom;
import com.fym.learnspring.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}