package com.run.service.impl;


import com.run.dao.IAccountDao;
import com.run.factory.BeanFactory;
import com.run.service.IAccountService;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 16:15
 * @Version 1.0
 **/
public class AccountServiceImpl implements IAccountService {
    //传统方式
    //private IAccountDao accountDao=new AccountImpl();
    //通过工厂模式(容器)获取bean
    private   IAccountDao accountDao = (IAccountDao)BeanFactory.getBean("accountDao");
    @Override
    public void saveAccount() {
        int i=1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
