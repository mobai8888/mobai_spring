package com.sun.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: spring_01
 * @ClassName ConnectionUtils
 * @description:连接的工具类，它用于从数据源中获取一个连接，并且实现和线程的绑定
 * @author: lk
 * @create: 2020-03-26 20:05
 * @Version 1.0
 **/
public class ConnectionUtils {
    private ThreadLocal<Connection> t1=new ThreadLocal<>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){

            try {
                //1.先从ThreadLocal上获取
                Connection connection = t1.get();
                //2.判断当前线程上是否有连接
                if(connection==null){
                    //3.从数据源中获取一个连接，并且存入ThreadLocal中
                connection=dataSource.getConnection();
                t1.set(connection);
                }
                //4.返回当前线程上的连接
                return connection;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
    /**
     * 把连接和线程解绑
     */
    public void removeConnection(){
        t1.remove();
    }
}

