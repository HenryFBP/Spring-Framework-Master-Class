package com.henry.spring.aop.springaop;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DAO1 {
    public String retrieveSomething(){
    return this.getClass().getSimpleName();
    }
}
