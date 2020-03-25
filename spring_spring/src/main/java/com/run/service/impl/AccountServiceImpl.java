package com.run.service.impl;

import com.run.dao.AccountDao;
import com.run.dao.impl.AccountDaoImpl;
import com.run.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 18:49
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountServiceImpl() {
        System.out.println("无参数构建对象");
    }

    @Override
    public void saveAccount1() {

        accountDao.saveAccount();
    }


}
