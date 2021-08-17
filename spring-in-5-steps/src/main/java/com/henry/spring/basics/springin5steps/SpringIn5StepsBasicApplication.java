package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.henry.spring.basics.springin5steps.basic")
public class SpringIn5StepsBasicApplication {

    public static void main(String[] args) {

        System.out.println("hello world!");

        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);

        //get BinarySearchImpl from app context
        BinarySearchImpl binarySearch = acac.getBean(BinarySearchImpl.class);

        //test bean scopes...do we get the same class instance?
        BinarySearchImpl binarySearch2 = acac.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch2);
        System.out.println(binarySearch == binarySearch2); //

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 5);

        System.out.println(result);
    }

}
