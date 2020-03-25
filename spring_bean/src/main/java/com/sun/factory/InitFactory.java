package com.sun.factory;

/**
 * @program: spring_01
 * @ClassName InitFactory
 * @description:
 * @author: lk
 * @create: 2020-03-25 20:52
 * @Version 1.0
 **/

import com.sun.service.AccountService;
import com.sun.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class InitFactory {
    public AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
