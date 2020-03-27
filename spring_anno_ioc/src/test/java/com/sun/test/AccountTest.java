package com.sun.test;

/**
 * @program: spring_01
 * @ClassName AccountTest
 * @description:账户测试类
 * @author: lk
 * @create: 2020-03-26 02:51
 * @Version 1.0
 **/

import com.sun.domain.Account;
import com.sun.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:bean.xml")
public class AccountTest {
    @Autowired
    private AccountService as;
    @Test
    public void testFindAll(){
        List<Account> allAccount = as.findAllAccount();
        for(Account account:allAccount){
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne(){
        Account account = as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave(){
        Account account=new Account();
        account.setName("李四");
        account.setMoney(15600f);
        as.saveAccount(account);
    }
    @Test
    public void testUpdate(){
        Account account=as.findAccountById(4);
        account.setMoney(123f);
        as.updateAccount(account);
    }
    @Test
    public void testDelete(){
        as.deleteAccount(5);
    }
}
