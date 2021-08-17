package com.henry.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE) //give a new bean whenever requested...
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    // private SortAlgorithm bubbleSortAlgorithm; //require dep by name. Spring actually looks at the name of the field.

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct method called");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy method called");
    }

    public int binarySearch(int[] haystack, int needle) {
        /*
        1. sort array with tightly coupled bubble sort algo (NOT some ambiguous algo)
        2. search array
        3. return result
         */

        //step 1.

        //what if we want to change sortAlgo to "QuickSortAlgorithm"?
        // This is a problem tight coupling brings.
        int[] sorted = this.sortAlgorithm.sort(haystack);

        System.out.println(this.sortAlgorithm); //what sort algo are we using?

        //step 2
        //...

        //step 3
        return 3; //example
    }

}
