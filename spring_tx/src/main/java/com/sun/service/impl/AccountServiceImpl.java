package com.sun.service.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.AccountService;

import java.util.List;

/**
 * @program: spring_01
 * @ClassName ServiceImpl
 * @description:账户业务实现层
 * @author: lk
 * @create: 2020-03-27 20:14
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

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

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        //查询出转出账户
        Account sName = accountDao.findAccountByName(sourceName);
        //查询出转入账户
        Account tName = accountDao.findAccountByName(targetName);
        //转出账户减钱
        sName.setMoney(sName.getMoney()-money);
        //转入账户加钱
        tName.setMoney(tName.getMoney()+money);
        //更新转出账户
        accountDao.updateAccount(sName);
        //更新转入账户
        accountDao.updateAccount(tName);
    }
}
