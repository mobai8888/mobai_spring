package com.sun.utils;

import java.sql.SQLException;

/**
 * @program: spring_01
 * @ClassName TransactionManager
 * @description:和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 * @author: lk
 * @create: 2020-03-26 20:27
 * @Version 1.0
 **/
public class TransactionManager{
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }
    //开启事务
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //提交事务
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //回滚事务
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //释放连接
    public void release(){
        try {
            //还回连接池中
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setAccountService(com.sun.dao.impl.AccountDaoImpl accountService) {
    }
}
