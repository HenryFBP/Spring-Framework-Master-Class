package com.henry.spring.basics.springin5steps;

public class BinarySearchImpl {

    public int binarySearch(int[] haystack, int needle) {
        /*
        1. sort array with tightly coupled bubble sort algo (NOT some ambiguous algo)
        2. search array
        3. return result
         */

        //step 1.

        //what if we want to change sortAlgo to "QuickSortAlgo"?
        // This is a problem tight coupling brings.
        BubbleSortAlgo sortAlgo = new BubbleSortAlgo();
        int[] sorted = sortAlgo.sort(haystack);


        //step 2
        //...

        //step 3
        return 3; //example
    }

}
