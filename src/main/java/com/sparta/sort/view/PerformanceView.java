package com.sparta.sort.view;

import java.util.Arrays;

public class PerformanceView {

    public static void printArrays(int[] unsorted, int[] sorted) {
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(unsorted));
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(sorted));
    }

    public void printCollectionsPerformance(long elapsedNanoseconds) {
        System.out.println("Collections.sort sorted the array in " + elapsedNanoseconds + " nanoseconds");
    }
    public static void printTimedPerformance(String algoName, long elapsedNanoseconds) {
        System.out.println(algoName + " sorting time: " + elapsedNanoseconds + " nanoseconds.");
    }
}
