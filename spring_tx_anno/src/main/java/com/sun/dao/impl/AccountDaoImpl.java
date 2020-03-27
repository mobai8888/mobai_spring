package com.sun.dao.impl;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: spring_01
 * @ClassName AccountDaoImpl
 * @description:
 * @author: lk
 * @create: 2020-03-28 01:28
 * @Version 1.0
 **/
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Account findAccountById(Integer id) {
        List<Account> accountList = jdbcTemplate.query("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return accountList.isEmpty()?null:accountList.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accountList = jdbcTemplate.query("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if(accountList.isEmpty()){
            return null;
        }
        if(accountList.size()>1){
            throw  new RuntimeException("数据不唯一，结果有误");
        }
        return accountList.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
