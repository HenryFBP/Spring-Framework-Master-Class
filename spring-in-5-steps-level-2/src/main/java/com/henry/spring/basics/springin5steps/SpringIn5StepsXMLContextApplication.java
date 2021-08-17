package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.henry.spring.basics.springin5steps.basic")
public class SpringIn5StepsXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            // [xmlJdbcConnection, xmlPersonDAO]

            XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);

            LOGGER.info("{} {}", personDao, personDao.getJdbcConnection());
        }
    }
}
