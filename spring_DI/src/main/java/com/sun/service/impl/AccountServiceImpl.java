package com.sun.service.impl;

import com.sun.service.AccountService;

import java.util.Date;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 21:21
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。"+name+","+age+","+birthday);
    }
}
