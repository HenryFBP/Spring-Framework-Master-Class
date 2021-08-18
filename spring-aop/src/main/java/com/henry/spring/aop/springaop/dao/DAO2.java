package com.henry.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAO2 {
    public String retrieveSomething(){
    return this.getClass().getSimpleName();
    }
}
