package com.sun.service;

import com.sun.domain.Account;

import java.util.List;

//业务层接口
public interface AccountService {
    /**
    * @Description:查询所有
    * @Param:
    * @return:
    */
    List<Account> findAllAccount();
    /**
    * @Description:查询一个
    * @Param: id
    * @return:
    */

    Account findAccountById(Integer id);
    /**
    * @Description:保存
    * @Param:account
    * @return:
    */
    void saveAccount(Account account);
    /**
    * @Description:更新
    * @Param:account
    * @return:
    */
    void updateAccount(Account account);
    /**
     * 删除
     * @param id
     */
    void deleteAccount(Integer id);

}
