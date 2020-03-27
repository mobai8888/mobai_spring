package com.sun.service.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl
 * @description:
 * @Transactional
 * 该注解的属性和 xml 中的属性含义一致。该注解可以出现在接口上，类上和方法上。
出现接口上，表示该接口的所有实现类都有事务支持。
出现在类上，表示类中所有方法有事务支持
出现在方法上，表示方法有事务支持。
以上三个位置的优先级：方法>类>接口
 * @author: lk
 * @create: 2020-03-28 01:37
 * @Version 1.0
 **/
@Service("accountService")
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("转账。。。。。。。。");
        Account source=accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targetName);
        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);
        accountDao.updateAccount(source);

        accountDao.updateAccount(target);
    }
}
