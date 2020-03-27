package com.sun.jdbcTemplate;

import com.sun.domain.Account;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: spring_01
 * @ClassName jdbcTemplate3
 * @description:JdbcTemplate的CRUD操作
 * @author: lk
 * @create: 2020-03-27 18:38
 * @Version 1.0
 **/
public class jdbcTemplate3 {
    public static void main(String[] args){
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        JdbcTemplate jt=ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //执行操作
        //保存
        jt.update("insert into account(name,money) values(?,?)","fff",350f);
        //更新
        jt.update("update account set name=?,money=? where id=?","aaa","230f",1);
        //删除
        jt.update("delete from account where id=?",7);
        //查询所有
        List<Account> accounts = jt.query("select * from account where money>?", new AccountRowMapper(), 100f);
        List<Account> accounts1 = jt.query("select * from account where money>?", new BeanPropertyRowMapper<Account>(Account.class), 100f);
        for (Account account: accounts1) {
            System.out.println(account);
        }
        //查询一个
        List<Account> accountList = jt.query("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), 2);
        System.out.println(accountList.isEmpty()?"没有内容":accountList.get(0));
        //查询返回一行一列（使用聚核函数，但不加group by 子句）
        Long count=jt.queryForObject("select count(*) from account where money>?",Long.class,1000f);
        System.out.println(count);
    }

}
/**
 * 定义Account的封装策略
 */
class AccountRowMapper implements RowMapper<Account>{
    /**
     * 把结果集中的数据封装到Account中，然后由spring把每个Account加到集合中
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account=new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getFloat("money"));
        return account;
    }

}
