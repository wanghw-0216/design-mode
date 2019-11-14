package com.fun.design.抽象工厂模式.factory;


import com.fun.design.抽象工厂模式.product.ProductA;
import com.fun.design.抽象工厂模式.product.ProductB;

/**
 * @Author whw
 * @Description //抽象工厂接口，声明创建抽象产品对象的操作
 * @Date 16:11 2019/11/13
 * @Param
 * @return
 */
public interface AbstractFactory {

    /**
     * @Author whw
     * @Description //用来创建产品A接口的实例
     * @Date 17:28 2019/11/13
     * @Param
     * @return
     */

    ProductA createPA();

    /**
     * @Author whw
     * @Description //创建B
     * @Date 17:29 2019/11/13
     * @Param
     * @return
     */

    ProductB createPB();


}
