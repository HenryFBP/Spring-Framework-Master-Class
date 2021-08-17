package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.henry.spring.basics.springin5steps.cdi")
public class SpringIn5StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {

        System.out.println("hello world!");
        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);

        SomeCDIBusiness business = acac.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} dao={}", business, business.getSomeCDIDAO());

    }

}
