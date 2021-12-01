package com.sparta.sort.view;

public class PerformanceView {
    public void printCollectionsPerformance(long elapsedNanoseconds) {
        System.out.println("Collections.sort sorted the array in " + elapsedNanoseconds + " nanoseconds");
    }
    public void printTimedPerformance(String algoName, long elapsedNanoseconds) {
        System.out.println(algoName + " sorted the array in " + elapsedNanoseconds + " nanoseconds.");
    }
}
