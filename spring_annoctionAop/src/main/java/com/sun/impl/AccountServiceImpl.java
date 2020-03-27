package com.sun.impl;

import com.sun.AccountService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:账户的业务层实现类
 * @author: lk
 * @create: 2020-03-27 14:07
 * @Version 1.0
 **/
@Service("service")
public class AccountServiceImpl implements AccountService{

    @Override
    public void saveAccount() {
        System.out.println("执行保存");
    }

    @Override
    public void updateAccount() {
        System.out.println("执行更新");
    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }

}
