package com.sun;

import com.sun.configer.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @program: spring_01
 * @ClassName QueryRunnerTest
 * @description:测试queryRunner是否是单例
 * @author: lk
 * @create: 2020-03-26 14:05
 * @Version 1.0
 **/
public class QueryRunnerTest {
    @Test
    public void testQueryRunner(){
        //获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //获取runner对象
        QueryRunner runner1 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runner1);
        QueryRunner runner2 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runner2);
        System.out.println(runner1==runner2);
    }
}
