package com.fun.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NewsPaper
 * @Description TODO
 * @Author whw
 * @Date 2020/5/7 15:31
 * @Version 1.0
 **/
public class NewsPaper implements Subject {
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserve() {
        for (Observer observer : observers) {
            observer.getNewsPaper();
        }
    }

    /**
     * @Author whw
     * @Description //发布新报纸
     * @Date 15:36 2020/5/7
     * @Param
     * @return
     **/
    public void publishPaper(){
        System.out.println("start  publish");
        notifyObserve();
    }
}
