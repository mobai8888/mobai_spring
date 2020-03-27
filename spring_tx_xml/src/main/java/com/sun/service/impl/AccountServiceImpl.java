package com.sun.service.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.AccountService;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @author: lk
 * @create: 2020-03-28 01:37
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("转账。。。。。。。。");
        Account source=accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targetName);
        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);
        accountDao.updateAccount(source);
        int i=1/0;
        accountDao.updateAccount(target);
    }
}
