package com.sun.jdk.impl;

import com.sun.jdk.IActor;

/**
 * @program: spring_01
 * @ClassName Actor
 * @description:
 * @author: lk
 * @create: 2020-03-27 13:20
 * @Version 1.0
 **/
//实现了接口，就表示具有接口中的方法实现。即：符合经纪公司的要求
public class Actor implements IActor{

    @Override
    public void basicAct(float money) {
        System.out.println("拿到钱，开始基本的表演："+money);
    }

    @Override
    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险的表演："+money);
    }
}
