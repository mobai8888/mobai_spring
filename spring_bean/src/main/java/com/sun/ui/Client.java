package com.sun.ui;

import com.sun.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_01
 * @ClassName Client
 * @description:
 * @author: lk
 * @create: 2020-03-25 20:34
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args){
      //ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = context.getBean("accountService", AccountServiceImpl.class);
        System.out.println(accountService);
        AccountServiceImpl accountService1 = context.getBean("accountService", AccountServiceImpl.class);
        System.out.println(accountService1);
        accountService.saveAccount();
        context.close();
    }
}
