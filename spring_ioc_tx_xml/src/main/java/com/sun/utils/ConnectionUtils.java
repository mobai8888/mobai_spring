package com.sun.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: spring_01
 * @ClassName ConnectionUtils
 * @description:连接的工具类，它用于从数据源中获取一个连接，并且实现和线程的绑定
 * @author: lk
 * @create: 2020-03-27 19:44
 * @Version 1.0
 **/
public class ConnectionUtils {
    private ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection() {

        try {
            //先从ThreadLocal上获取
            Connection conn = threadLocal.get();
            //判断当前线程是否有连接
            if (conn == null) {
                //3.从数据源中获取一个连接，并且存入ThreadLocal中
                conn = dataSource.getConnection();
                threadLocal.set(conn);
            }
            //返回当前线程
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 把连接和线程解绑
     */
    public void removeConnection(){
        threadLocal.remove();
    }
}
