package com.fun.design.生成器模式.builder.impl;

import com.fun.design.生成器模式.builder.Builder;
import com.fun.design.生成器模式.product.Product;

/**
 * @ClassName BuilderA
 * @Description 生成器的A实例，第一种表示方法。
 * @Author whw
 * @Date 2019/11/15 14:07
 * @Version 1.0
 */
public class BuilderA implements Builder {

    private Product product = new Product();

    @Override
    public void builderPid(String id) {
        product.setProductId(id);
    }

    @Override
    public void builderPname(String part2) {
        product.setpName(part2);
    }

    public Product getResult(){
        return product;
    }
}
