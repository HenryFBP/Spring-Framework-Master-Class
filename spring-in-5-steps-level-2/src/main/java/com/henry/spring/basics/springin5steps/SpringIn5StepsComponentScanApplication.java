package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.henry.spring.basics.componentscan") //necessary as outside packages are required
public class SpringIn5StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {

        System.out.println("hello world!");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("foobar123");
        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getJdbcConnection());
        LOGGER.info("{}", componentDAO.getJdbcConnection());

        LOGGER.info("{}", componentDAO2);
        LOGGER.info("{}", componentDAO2.getJdbcConnection());
    }

}
