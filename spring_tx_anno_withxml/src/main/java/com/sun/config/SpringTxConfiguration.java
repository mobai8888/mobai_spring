package com.sun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: spring_01
 * @ClassName SpringTxConfiguration
 * @description:spring的配置类，相当于bean.xml
 * @author: lk
 * @create: 2020-03-28 03:10
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = "com.sun")
@Import({JdbcConfiguration.class,TransactionConfig.class})
@PropertySource("jdbcConfig.properties")
@EnableTransactionManagement //开启事务注解功能
public class SpringTxConfiguration {

}
