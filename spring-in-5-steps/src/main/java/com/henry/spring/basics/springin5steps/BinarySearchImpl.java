package com.henry.spring.basics.springin5steps;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    //this constructor allows us to decouple BubbleSort...
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
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
