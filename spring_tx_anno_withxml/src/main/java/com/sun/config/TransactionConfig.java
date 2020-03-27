package com.sun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

import javax.sql.DataSource;

/**
 * @program: spring_01
 * @ClassName TransactionConfig
 * @description:事务相关的配置类
 * @author: lk
 * @create: 2020-03-28 03:19
 * @Version 1.0
 **/
public class TransactionConfig {
    /**
     * 用于创建事务管理器对象
     * @param dataSource
     * @return
     */
    @Bean(name = "transactionManager")
    public PlatformTransactionManager createTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
