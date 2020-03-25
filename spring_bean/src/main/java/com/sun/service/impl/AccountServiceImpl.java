package com.sun.service.impl;


import com.sun.service.AccountService;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 20:29
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。");
    }
    public void init(){
        System.out.println("对象初始化了");
    }
    public void destory(){
        System.out.println("对象销毁了");
    }
}
