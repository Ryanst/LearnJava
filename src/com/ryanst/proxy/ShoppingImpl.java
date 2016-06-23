package com.ryanst.proxy;

/**
 * Created by zhengjuntong on 16/6/4.
 */
public class ShoppingImpl implements Shopping {
    @Override
    public Object[] doShopping(long money) {
        System.out.println("逛淘宝 ,逛商场,买买买!!");
        System.out.println(String.format("花了%s块钱", money));
        return new Object[] { "鞋子", "衣服", "零食" };
    }
}
