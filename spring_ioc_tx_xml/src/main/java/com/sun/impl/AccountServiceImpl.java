package com.sun.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.AccountService;

import java.util.List;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:账户业务实现类
 * @author: lk
 * @create: 2020-03-27 19:34
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        return null;
    }

    @Override
    public Account findAccountById(Integer id) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Integer id) {

    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {

    }
}
