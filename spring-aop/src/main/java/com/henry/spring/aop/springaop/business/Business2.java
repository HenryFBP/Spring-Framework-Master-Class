package com.henry.spring.aop.springaop.business;

import com.henry.spring.aop.springaop.dao.DAO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Business2 {

    @Autowired
    private DAO2 dao;

    public String calcSomething() throws Exception {

        //fail 50% of the time
        if (new Random().nextBoolean()) {
            throw new Exception("Wow, I'm an exception");
        }

        return dao.retrieveSomething() + " is 30 loafs wide";
    }
}
