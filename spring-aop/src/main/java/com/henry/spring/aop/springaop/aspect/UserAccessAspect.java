package com.henry.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//config and related to AOP
@Configuration
@Aspect
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What methods do I intercept?
    // execution(* PACKAGE.*.*(..))
    //           ^         ^ ^  ^
    //           |         | |  \----any arguments
    //           |         | |
    //           |         | \--- all method calls
    //           |         |
    //           |         any class
    //           |
    //           any return type

    @Before("execution(* com.henry.spring.aop.springaop.business.*.*(..))") //pass a pointcut to before annotation
    public void before(JoinPoint joinPoint){
        //what do I do?
//        logger.info("Checking user access");
//        logger.info("Allowing execution - {}",joinPoint);
    }
}
