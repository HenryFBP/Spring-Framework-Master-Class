package com.henry.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private DAO2 dao;

    public String calcSomething(){
        return dao.retrieveSomething() + " is 30 loafs wide";
    }
}
