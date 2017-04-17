package com.fym.learnspring.mapper;


import com.fym.learnspring.po.Items;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsMapper {
    Items selectByPrimaryKey(Integer id);

    Items updateByPrimaryKeyWithBLOBs(Items items);

}
