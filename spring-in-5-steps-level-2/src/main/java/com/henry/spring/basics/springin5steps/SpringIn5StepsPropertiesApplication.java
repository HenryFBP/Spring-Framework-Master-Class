package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args) {

        System.out.println("hello world!");

        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);

        SomeExternalService service = acac.getBean(SomeExternalService.class);

        System.out.println(service.returnServiceURL());

    }

}
