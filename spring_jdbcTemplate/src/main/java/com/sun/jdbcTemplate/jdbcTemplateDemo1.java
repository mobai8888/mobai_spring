package com.sun.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

/**
 * @program: spring_01
 * @ClassName jdbcTemplateDemo1
 * @description:JdbcTemplate的最基本用法
 * @author: lk
 * @create: 2020-03-27 18:26
 * @Version 1.0
 **/
public class jdbcTemplateDemo1 {
    public static void main(String[] args){
        //准备数据源：spring的内置数据源
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring");
        ds.setUsername("root");
        ds.setPassword("123456");
        //创建JdbcTemplate
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //设置数据源
        jdbcTemplate.setDataSource(ds);
        //执行操作
        jdbcTemplate.execute("insert into account(name,money) values('ddd',100)");

    }
}
