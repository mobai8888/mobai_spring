package com.sun.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: spring_01
 * @ClassName jdbcTemplateDemo2
 * @description:xml
 * @author: lk
 * @create: 2020-03-27 18:34
 * @Version 1.0
 **/
public class jdbcTemplateDemo2 {
    public static void main(String[] args){
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        //执行操作
        jdbcTemplate.execute("insert into account(name,money)values('eee',5000)");
    }

}
