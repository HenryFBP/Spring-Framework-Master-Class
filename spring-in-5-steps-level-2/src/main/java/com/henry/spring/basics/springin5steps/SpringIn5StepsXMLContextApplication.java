package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@Configuration
//@ComponentScan("com.henry.spring.basics.springin5steps.basic") //getting rid of these, moved to xml file...
public class SpringIn5StepsXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            // [xmlJdbcConnection, xmlPersonDAO]

            LOGGER.info("Beans loaded from XML file:");
            final int[] i = {0};
            Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(
                    x->LOGGER.info("{} {}", i[0]++,x)
            );

            XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);

            LOGGER.info("{} {}", personDao, personDao.getJdbcConnection());
        }
    }
}
