package com.henry.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

//@Primary //prefer this bean
@Component()
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        //logic goes here
        return numbers;
    }
}

