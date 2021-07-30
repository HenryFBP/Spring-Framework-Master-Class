package com.henry.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        System.out.println("hello world!");
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        //get BinarySearchImpl from app context
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        //test bean scopes...do we get the same class instance?
        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch2);
        System.out.println(binarySearch == binarySearch2); //

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 5);

        System.out.println(result);
    }

}
