package com.fun.design.observer;

import lombok.Data;

/**
 * @ClassName Reader
 * @Description TODO
 * @Author whw
 * @Date 2020/5/7 15:33
 * @Version 1.0
 **/
@Data
public class Reader implements Observer{
    private String name;

    public Reader(String name){
        this.name = name;
    }
    @Override
    public void updateStatus(float temparature, float humidity, float pressure) {

    }

    @Override
    public void getNewsPaper() {
        System.out.println(name + "拿到了报纸");
    }
}
