package com.sun.dao;

import com.sun.domain.Account;

/**
 * @program: spring_01
 * @ClassName IAccountDao
 * @description:账户的持久层接口
 * @author: lk
 * @create: 2020-03-27 17:52
 * @Version 1.0
 **/
public interface IAccountDao {
    /**
    * @Description: 根据ID查询账户
    * @Param:id
    * @return:
    */
    Account findAccountById(Integer id);
    /**
    * @Description:根据名称查询账户
    * @Param:name
    * @return:
    */
    Account findAccountByName(String name);
    /**
    * @Description:更新账户
    * @Param:account
    * @return:
    */
    void updateAccount(Account account);
}
