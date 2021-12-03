package com.sparta.sort.view;

public class PerformanceView {
    public void printCollectionsPerformance(long elapsedNanoseconds) {
        System.out.println("Collections.sort sorted the array in " + elapsedNanoseconds + " nanoseconds");
    }
    public void printTimedPerformance(String algoName, long elapsedNanoseconds) {
        System.out.println(algoName + " sorted the array in " + elapsedNanoseconds + " nanoseconds.");
    }

//    public void runSort(int[] array) {
//        this.primarySorter.sortArray(array, 0, array.length-1, this.timing);
//    }
//
//    public void timedView() {
//        this.view.printTimedPerformance(this.primarySorter.getName(), this.primarySorter.getSortingTime());
//    }
}
