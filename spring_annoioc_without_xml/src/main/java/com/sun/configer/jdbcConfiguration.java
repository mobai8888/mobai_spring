package com.sun.configer;

/**
 * @program: spring_01
 * @ClassName jdbcConfiguration
 * @description:
 * @author: lk
 * @create: 2020-03-26 13:40
 * @Version 1.0
 **/

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 和spring连接数据库相关的配置类
 */

public class jdbcConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    /**
     * 创建一个数据源，并存入 spring 容器中
     * @return
     */
    @Bean(name = "dataSource")
    public DataSource createDataSource(){

        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setUser(username);
            ds.setPassword(password);
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            return ds;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 创建一个 DBAssit，并且也存入 spring 容器中
     * @param dataSource
     * @return
     */
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createDbUtils(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

}
