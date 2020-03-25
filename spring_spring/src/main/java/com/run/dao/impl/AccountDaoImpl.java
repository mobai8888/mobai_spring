package com.run.dao.impl;

import com.run.dao.AccountDao;


/**
 * @program: spring_01
 * @ClassName IAccountDaoImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 18:47
 * @Version 1.0
 **/
public class AccountDaoImpl implements AccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
