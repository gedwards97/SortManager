package com.sparta.sort.controller;

import com.sparta.sort.view.UserView;

import java.util.*;

public class SortDriver {
    public static void main(String[] args) throws Exception {
        UserView userView = new UserView();
        userView.launch();
//        // User input
//        Scanner scan = new Scanner(System.in);
//        String structureInput = scan.next();
//        System.out.println("How many elements would you like the data structure to contain?");
//        int structureLength = Integer.parseInt(scan.next());
//        System.out.println("Would you like to time your algorithm?");
//        String timingInput = scan.next();
//        System.out.println("Would you like to compare two algorithms?");
//        String compareInput = scan.next();
//        // Algorithms
//        String primaryAlgo;
//        String secondaryAlgo = null;
//        if (compareInput.toLowerCase().equals("yes")) {
//            System.out.println("Please select your primary algorithm (Bubble / Quick / Sort);");
//            primaryAlgo = scan.next();
//            System.out.println("Please select your secondary algorithm (Bubble / Quick / Sort):");
//            secondaryAlgo = scan.next();
//        } else {
//            System.out.println("Please select your primary algorithm (Bubble / Quick / Sort);");
//            primaryAlgo = scan.next();
//        }
//
//        UserView controller = new UserView();
//        controller.setAlgorithm(primaryAlgo);
//        controller.setTiming(timingInput);
//
//        // Sort rand array
//        int[] array = randIntArrayGenerator(structureLength);
//        controller.runSort(array);
//        controller.timedView();


//        sorter.sort(array, 0, array.length - 1, true);
//        PerformanceView sorterPerformance = new PerformanceView(sorter.getName(), sorter.getSortingTime());
//        sorterPerformance.printPerformance();


//        // LIST TRIAL
//        int[] array = randIntArrayGenerator(100);
//        List list  = ListFactory.getList(array, "linked");
//
//        BaselineSort blSort = new BaselineSort();
//        blSort.sortList(list, true);
//        PerformanceView view = new PerformanceView();
//        view.printAlgoPerformance(blSort.getName(), blSort.getSortingTime());
    }

    public static int[] randIntArrayGenerator(int arrayLength) {
        Random random = new Random();
        int[] array = random.ints(arrayLength, 1, 101).toArray();
        return array;
    }
}
