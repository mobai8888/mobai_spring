package com.run.dao.impl;

import com.run.dao.IAccountDao;

/**
 * @program: spring_01
 * @ClassName AccountImpl
 * @description:
 * @author: lk
 * @create: 2020-03-25 16:13
 * @Version 1.0
 **/
public class AccountImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户！");
    }
}
