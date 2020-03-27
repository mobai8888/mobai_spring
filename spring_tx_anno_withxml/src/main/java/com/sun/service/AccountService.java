package com.sun.service;

import com.sun.domain.Account;

public interface AccountService {
    //根据id查询账户信息
    Account findAccountById(Integer id);
    /**
     * 转账
     * @param sourceName    转成账户名称
     * @param targetName    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName, String targetName, Float money);
}
