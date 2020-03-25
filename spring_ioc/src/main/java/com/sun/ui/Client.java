package com.sun.ui;

import com.sun.service.impl.AccountServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_01
 * @ClassName Client
 * @description:
 * @author: lk
 * @create: 2020-03-26 01:37
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = context.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();
        context.close();
    }

}
