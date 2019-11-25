package com.fun.design.Prototype.prototype;


import lombok.Data;

/**
 * @Author whw
 * @Description //声明一个克隆自身的接口
 * @Date 13:58 2019/11/25
 * @Param
 * @return
 */
public interface Prototype {


    /**
     * @Author whw
     * @Description //克隆自身的方法。
     * @Date 13:59 2019/11/25
     * @Param []
     * @return com.fun.design.Prototype.prototype.Prototype
     */
    public Prototype clone();

    public void setFlag(int num);
}
