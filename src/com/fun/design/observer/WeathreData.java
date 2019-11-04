package com.fun.design.observer;

import javax.naming.ldap.PagedResultsControl;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WeathreData
 * @Description 主题类具体的实现，负责管理天气数据的主题。
 * @Author whw
 * @Date 2019/8/28 17:18
 * @Version 1.0
 */

public class WeathreData implements Subject {
    //订阅该主题的观察者
    private List<Observer> observers = new ArrayList<>();
    //温度
    private float temparature;
    //湿度
    private float humidity;
    //气压
    private float pressure;
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("当前注册观察者 === " + observer.getClass());
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i > 0){
            observers.remove(i);
        }
    }
    @Override
    public void notifyObserve() {
        for(int i = 0 ; i < observers.size() ; i++){
             observers.get(i).updateStatus(temparature , humidity , pressure);
        }
    }

    public void setMeasureements(float temparature , float humidity , float pressure){
        this.temparature = temparature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserve();
    }
}
