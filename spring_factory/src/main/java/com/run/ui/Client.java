package com.run.ui;

import com.run.factory.BeanFactory;
import com.run.service.IAccountService;

/**
 * @program: spring_01
 * @ClassName Client
 * @description:
 * @author: lk
 * @create: 2020-03-25 18:04
 * @Version 1.0
 **/
/*
* 模拟一个表现层，调用业务层*/
public class Client {
    public static void main(String[] args){
        for (int i = 0; i <5 ; i++) {
            IAccountService accountService = (IAccountService)BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
    }
}
