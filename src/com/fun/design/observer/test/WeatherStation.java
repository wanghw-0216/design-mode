package com.fun.design.observer.test;

import com.fun.design.observer.CurrentConditionsDisplay;
import com.fun.design.observer.WeathreData;

/**
 * @ClassName Weather
 * @Description TODO
 * @Author whw
 * @Date 2019/8/28 20:00
 * @Version 1.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeathreData weathreData = new WeathreData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weathreData);
        weathreData.setMeasureements(10 , 555 , 30.1f);
    }
}
