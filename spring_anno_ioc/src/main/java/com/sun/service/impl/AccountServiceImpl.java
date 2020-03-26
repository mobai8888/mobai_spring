package com.sun.service.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:账户的业务层实现类
 * @author: lk
 * @create: 2020-03-26 02:18
 * @Version 1.0
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;



    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }
}
