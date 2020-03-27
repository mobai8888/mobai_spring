package com.sun.dao;

import com.sun.domain.Account;

public interface AccountDao {
    //根据id查询账户
    Account findAccountById(Integer id);
    //根据名称查询账户
    Account findAccountByName(String name);
    //更新账户
    void updateAccount(Account account);
}
