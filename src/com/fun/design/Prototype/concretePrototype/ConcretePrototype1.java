package com.fun.design.Prototype.concretePrototype;

import com.fun.design.Prototype.prototype.Prototype;
import lombok.Data;

/**
 * @ClassName ConcretePrototype1
 * @Description TODO
 * @Author whw
 * @Date 2019/11/25 13:59
 * @Version 1.0
 */
@Data
public class ConcretePrototype1 implements Cloneable  , Prototype {

    /**
     * 类名表示
     */
    private String className;

    /**
     * 实例标记
     */
    private int flag;


    @Override
    public Prototype clone() {
        //此处省略复制值的步骤
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setClassName(this.getClassName());
        return prototype1;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "className='" + className + '\'' +
                ", flag=" + flag +
                '}';
    }


}
