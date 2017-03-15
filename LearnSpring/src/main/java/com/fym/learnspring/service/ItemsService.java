package com.fym.learnspring.service;

import com.fym.learnspring.po.ItemsCustom;
import com.fym.learnspring.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

}