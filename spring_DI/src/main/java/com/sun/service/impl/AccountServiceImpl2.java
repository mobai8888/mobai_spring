package com.sun.service.impl;

import com.sun.service.AccountService;

import java.util.*;

/**
 * @program: spring_01
 * @ClassName AccountServiceImpl2
 * @description:
 * @author: lk
 * @create: 2020-03-26 00:50
 * @Version 1.0
 **/
public class AccountServiceImpl2 implements AccountService {

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,Object> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    @Override
    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}
