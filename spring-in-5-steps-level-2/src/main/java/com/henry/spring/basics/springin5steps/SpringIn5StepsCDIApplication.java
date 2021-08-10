package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {

        System.out.println("hello world!");
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);

        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} dao={}", business, business.getSomeCDIDAO());

    }

}
