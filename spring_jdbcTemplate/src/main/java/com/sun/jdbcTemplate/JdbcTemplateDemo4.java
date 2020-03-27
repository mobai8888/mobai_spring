package com.sun.jdbcTemplate;

import com.sun.dao.IAccountDao;
import com.sun.dao.impl.AccountDaoImpl;
import com.sun.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_01
 * @ClassName JdbcTemplateDemo4
 * @description:
 * @author: lk
 * @create: 2020-03-27 18:57
 * @Version 1.0
 **/
public class JdbcTemplateDemo4 {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
        account.setMoney(30000f);
        accountDao.updateAccount(account);
    }

}
