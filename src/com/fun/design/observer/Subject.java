package com.fun.design.observer;



/**
 * @Author whw
 * @Description //主题接口，对象使用此接口实现观察者的注册，删除。
 * @Date 16:46 2019/8/28
 * @Param
 * @return
 */
public interface Subject {
    /**
     * @Author whw
     * @Description //注册成为观察者
     * @Date 16:47 2019/8/28
     * @Param []
     * @return
     */
    public void registerObserver(Observer observer);


    /**
     * @Author whw
     * @Description //移除观察者
     * @Date 17:04 2019/8/28
     * @Param []
     * @return void
     */
    public void removeObserver(Observer observer);



    /**
     * @Author whw
     * @Description //数据更新
     * @Date 17:05 2019/8/28
     * @Param
     * @return
     */
    public void notifyObserve();
}
