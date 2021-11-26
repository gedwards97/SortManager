package com.sparta.sort;

import java.util.Random;
import java.util.Scanner;

public class SortDriver {
    public static void main(String[] args) {
        // User input
        System.out.println("Which sorting algo would you like to use? (Bubble/Quick)");
        Scanner scan = new Scanner(System.in);
        String algoName = scan.next();
        SortingAlgo sorter = SorterFactory.getAlgo(algoName);

        // Sort rand array
        int[] array = randIntArrayGenerator(100);
        sorter.sort(array, 0, array.length - 1, true);
        PerformanceView sorterPerformance = new PerformanceView(sorter.getName(), sorter.getSortingTime());
        sorterPerformance.printPerformance();
    }

    public static int[] randIntArrayGenerator(int arrayLength) {
        Random random = new Random();
        int[] array = random.ints(arrayLength, 1, 101).toArray();
        return array;
    }
}
