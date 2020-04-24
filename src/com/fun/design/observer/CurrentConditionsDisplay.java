package com.fun.design.observer;


/**
 * @ClassName CurrentConditionsDisplay
 * @Description 观察者具体实现
 * @Author whw
 * @Date 2019/8/28 19:57
 * @Version 1.0
 */
public class CurrentConditionsDisplay implements Observer {
    private float temparature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void updateStatus(float temparature, float humidity, float pressure) {
        this.temparature = temparature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("current conditions " + temparature + "F degrees and " + humidity);
    }


}
