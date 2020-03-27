package com.sun.cjlib;

/**
 * @program: spring_01
 * @ClassName Actor
 * @description:被代理的对象
 * @author: lk
 * @create: 2020-03-27 13:43
 * @Version 1.0
 **/
public class Actor {

    public void basicAct(float money) {
        System.out.println("拿到钱，开始基本的表演："+money);
    }


    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险的表演："+money);
    }
}
