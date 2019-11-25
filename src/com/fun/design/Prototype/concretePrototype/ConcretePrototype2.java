package com.fun.design.Prototype.concretePrototype;

import com.fun.design.Prototype.prototype.Prototype;
import lombok.Data;

/**
 * @ClassName ConcretePrototype2
 * @Description TODO
 * @Author whw
 * @Date 2019/11/25 14:00
 * @Version 1.0
 */
@Data
public class ConcretePrototype2 implements Prototype {

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
        ConcretePrototype2 prototype2 = new ConcretePrototype2();
        prototype2.setClassName(this.getClassName());
        return prototype2;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "className='" + className + '\'' +
                ", flag=" + flag +
                '}';
    }
}
