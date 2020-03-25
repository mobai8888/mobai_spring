package com.sun.dao.impl;

import com.sun.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @program: spring_01
 * @ClassName AccountDaoImpl1
 * @description:
 * @author: lk
 * @create: 2020-03-26 01:28
 * @Version 1.0
 **/
@Repository("accountDao1")
public class AccountDaoImpl1 implements AccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户11111111");
    }
}
