package com.henry.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        System.out.println("hello world!");
        ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);

        //we can supply any sortAlgo we want
        BinarySearchImpl searchImpl = new BinarySearchImpl(new QuickSortAlgorithm());

        //prints com.henry.spring.basics.springin5steps.QuickSortAlgorithm@72ccd81a

        searchImpl.binarySearch(new int[]{12, 4, 6}, 5);
    }

}
