package com.sun.factory;

import com.sun.service.AccountService;
import com.sun.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring_01
 * @ClassName BeanFactory
 * @description:用于创建Service的代理对象的工厂
 * @author: lk
 * @create: 2020-03-27 00:32
 * @Version 1.0
 **/
public class BeanFactory {
    private AccountService accountService;
    private TransactionManager txManager;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }
    /**
     * 获取Service代理对象
     * @return
     */
    public AccountService getAccountService(){
        return (AccountService )Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 添加事务的支持
                     *
                     * @param proxy
                     * @param method
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       if("test".equals(method.getName())){
                            return method.invoke(accountService,args);
                       }
                       Object rtValue=null;
                        try {
                            //1.开启事务
                            txManager.beginTransaction();
                            //2.执行操作
                            rtValue=method.invoke(accountService,args);
                            //3.提交事务
                            txManager.commit();
                            //4.返回结果
                            return rtValue;
                        } catch (Exception e) {
                            //5.回滚操作
                            txManager.rollback();
                            throw new RuntimeException(e);
                        }finally {
                            //6.释放连接
                            txManager.release();
                        }

                    }
                });
    }
}
