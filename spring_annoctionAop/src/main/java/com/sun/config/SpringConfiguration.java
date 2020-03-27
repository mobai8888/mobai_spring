package com.sun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring_01
 * @ClassName SpringConfiguration
 * @description:
 * @author: lk
 * @create: 2020-03-27 16:03
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages={"com.sun"})
@EnableAspectJAutoProxy //开启 spring 对注解 AOP 的支持
public class SpringConfiguration {

}
