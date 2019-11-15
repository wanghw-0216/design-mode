package com.fun.design.生成器模式.product;

/**
 * @ClassName Product
 * @Description 产品
 * @Author whw
 * @Date 2019/11/15 14:10
 * @Version 1.0
 */
public class Product {
    //产品Id，两种表示方式，一种为A111一种为B111，用户可以选择值。
    private String productId;

    //产品名字，两种表示方式，一种为A开头，一种为B开头
    private String pName;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
