package com.sun.factory;

import com.sun.service.AccountService;
import com.sun.service.impl.AccountServiceImpl;

/**
 * @program: spring_01
 * @ClassName StaticFactory
 * @description:
 * @author: lk
 * @create: 2020-03-25 20:56
 * @Version 1.0
 **/
public class StaticFactory {
    public static AccountService getAccountService(){
        return new AccountServiceImpl();
    }

}
