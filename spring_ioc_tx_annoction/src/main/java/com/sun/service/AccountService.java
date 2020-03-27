package com.sun.service;

import com.sun.domain.Account;

import java.util.List;

/*
* 账户业务接口层
* */
public interface AccountService {
    //查询所有
    List<Account> findAllAccount();
    //查询一个
    Account findAccountById(Integer id);
    //保存
    void saveAccount(Account account);
    //更新
    void updateAccount(Account account);
    //删除
    void deleteAccount(Integer id);
    //转账
    void transfer(String sourceName,String targetName,Float money);
    //void test();//它只是连接点，但不是切入点，因为没有被增强
}
