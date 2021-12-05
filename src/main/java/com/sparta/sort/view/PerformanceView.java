package com.sparta.sort.view;

import java.util.Arrays;
import java.util.List;

public class PerformanceView {

    public static void printArrays(List unsorted, List sorted) {
        System.out.println("Unsorted List: ");
        System.out.println(unsorted);
        System.out.println("Sorted List: ");
        System.out.println(sorted);
    }

    public void printCollectionsPerformance(long elapsedNanoseconds) {
        System.out.println("Collections.sort sorted the array in " + elapsedNanoseconds + " nanoseconds");
    }
    public static void printTimedPerformance(String algoName, long elapsedNanoseconds) {
        System.out.println(algoName + " sorting time: " + elapsedNanoseconds + " nanoseconds.");
    }
}
