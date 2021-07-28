package com.henry.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {
        System.out.println("hello!");
        ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImpl searchImpl = context.getBean(BinarySearchImpl.class);

        searchImpl.binarySearch(new int[]{12, 4, 6}, 5);
    }

}
