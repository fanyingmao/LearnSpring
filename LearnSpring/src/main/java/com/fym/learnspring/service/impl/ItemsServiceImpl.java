package com.fym.learnspring.service.impl;

import com.fym.learnspring.mapper.ItemsMapperCustom;
import com.fym.learnspring.po.ItemsCustom;
import com.fym.learnspring.po.ItemsQueryVo;
import com.fym.learnspring.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}