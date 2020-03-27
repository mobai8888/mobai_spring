package com.sun.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * @program: spring_01
 * @ClassName TransactionManager
 * @description:和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 * @author: lk
 * @create: 2020-03-27 19:52
 * @Version 1.0
 **/
@Component("txManager")
@Aspect
public class TransactionManager {
    @Autowired
    private ConnectionUtils connectionUtils;

    @Pointcut("execution(* com.sun.service.impl.*.*(..))")
    public void pt1(){

    }

    //开启事务
    public void beginTransaction(){
        try {
            //手动提交事务
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
            connectionUtils.getThreadConnection().close();//还回连接池
            connectionUtils.removeConnection();//解除连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //环绕通知
    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint pip){

        try {
            Object rtValue=null;
            //获取参数
            Object[] args = pip.getArgs();
            //开启事务
            this.beginTransaction();
            //执行方法
            pip.proceed(args);
            //提交事务
            this.commit();
            //返回结果
            return rtValue;
        } catch (Throwable e) {
            //回滚事务
            this.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放资源
            this.release();
        }

    }
}
