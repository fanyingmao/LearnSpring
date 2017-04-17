package com.fym.learnspring.service.impl;

import com.fym.learnspring.mapper.ItemsMapper;
import com.fym.learnspring.mapper.ItemsMapperCustom;
import com.fym.learnspring.po.Items;
import com.fym.learnspring.po.ItemsCustom;
import com.fym.learnspring.po.ItemsQueryVo;
import com.fym.learnspring.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    @Autowired
    private ItemsMapper itemsMapper;

    public ItemsCustom findItemsById(Integer id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);
        //中间对商品信息进行业务处理
        //....
        //返回ItemsCustom
        ItemsCustom itemsCustom = new ItemsCustom();
        //将items的属性值拷贝到itemsCustom
        BeanUtils.copyProperties(items, itemsCustom);

        return itemsCustom;
    }



    public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
        //添加业务校验，通常在service接口对关键参数进行校验
        //校验 id是否为空，如果为空抛出异常

        //更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
        //updateByPrimaryKeyWithBLOBs要求必须转入id
        itemsCustom.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
    }
}