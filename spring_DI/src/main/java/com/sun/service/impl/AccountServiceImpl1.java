package com.sun.service.impl;

import com.sun.service.AccountService;

import java.util.Date;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl1
 * @description:
 * @author: lk
 * @create: 2020-03-25 23:03
 * @Version 1.0
 **/
public class AccountServiceImpl1 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount==1方法执行了。。。"+name+","+age+","+birthday);
    }
}
