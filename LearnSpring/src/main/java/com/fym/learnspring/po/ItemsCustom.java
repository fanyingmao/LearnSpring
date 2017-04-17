package com.fym.learnspring.po;

/**
 * Created by Brian on 2016/3/2.
 * 商品信息的扩展类
 */
public class ItemsCustom extends Items{
    //添加商品信息的扩展属性
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}