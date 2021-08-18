package com.henry.spring.aop.springaop.business;

import com.henry.spring.aop.springaop.dao.DAO1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private DAO1 dao;

    public String calcSomething(){
        return dao.retrieveSomething() + " is 20 loafs wide";
    }
}
