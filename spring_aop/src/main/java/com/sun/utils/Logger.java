package com.sun.utils;

/**
 * @program: spring_01
 * @ClassName Logger
 * @description:用于记录日志的工具类，它里面提供了公共的代码
 * @author: lk
 * @create: 2020-03-27 14:08
 * @Version 1.0
 **/
public class Logger {
    /**
     * 用于打印日志：计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void printLog(){
        System.out.println("Logger类中的pringLog方法开始记录日志了。。。");
    }
}
