package com.fun.design.生成器模式.builder.impl;

import com.fun.design.生成器模式.builder.Builder;
import com.fun.design.生成器模式.product.Product;

/**
 * @ClassName BuilderB
 * @Description 生成器的B实例，表示第二种表示方式。
 * @Author whw
 * @Date 2019/11/15 14:08
 * @Version 1.0
 */
public class BuilderB implements Builder {


    private Product product = new Product();
    @Override
    public void builderPid(String part1) {
        product.setProductId(part1);
    }

    @Override
    public void builderPname(String part2) {
        product.setpName(part2);
    }

    public Product getResult(){
        return product;
    }
}
