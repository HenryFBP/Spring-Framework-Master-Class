package com.henry.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//config and related to AOP
@Configuration
@Aspect
public class AfterAOPAspect {

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


    // intercept return from method after it completes
    @AfterReturning(
            value = "execution(* com.henry.spring.aop.springaop.business.*.*(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("JoinPoint {} returned {}",joinPoint,result);
    }

    //intercept exception thrown by something matched by pointcut
    @AfterThrowing(
            value = "execution(* com.henry.spring.aop.springaop.business.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("JoinPoint {} threw {}",joinPoint,exception.getClass().getSimpleName());
        logger.info(exception.toString());
    }


}
