package com.sun.dao.impl;

import com.sun.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @program: spring_01
 * @ClassName AccountDaoImpl
 * @description:
 * @author: lk
 * @create: 2020-03-26 01:27
 * @Version 1.0
 **/
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户000000");
    }
}
