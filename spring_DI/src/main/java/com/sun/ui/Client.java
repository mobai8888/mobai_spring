package com.sun.ui;

import com.sun.service.AccountService;
import com.sun.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_01
 * @ClassName Client
 * @description:
 * @author: lk
 * @create: 2020-03-25 21:29
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = context.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();
        AccountService accountService1=context.getBean("accountService1",AccountService.class);
        accountService1.saveAccount();
        AccountService accountService2=context.getBean("accountService2",AccountService.class);
        accountService2.saveAccount();
    }


}
