package com.sparta.sort.controller;

import com.sparta.sort.model.factory.SorterFactory;
import com.sparta.sort.model.algorithms.SortingAlgo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static Scanner scan = new Scanner(System.in);
    private static int dataStructureLength;
    private static boolean timeSort;
    private static boolean compareSort;
    private static SortingAlgo primaryAlgo;
    private static SortingAlgo secondaryAlgo = null;
    private static final List<String> ALGOS = Arrays.asList("bubble", "quick");

    private static boolean validateBinary() {
        String userInput = scan.next();
        while ((!userInput.equals("Y")) && !userInput.equals("N")) {
            System.out.println("Invalid input.");
            userInput = scan.next();
        }

        if (userInput.equals("Y")) return true;
        else return false;
    }

    private static int validateNum() {
        // Only pass to no. check if input is a number
        while(!scan.hasNextInt()) {
            System.out.println("Invalid input.");
            scan.next();
        }

        // Repeat if input <= 0
        int userInput = scan.nextInt();
        if (userInput <= 0) {
            System.out.println("Number must be > 0.");
            userInput = validateNum();
        }

        return userInput;
    }

    private static SortingAlgo validateAlgo() {
        String userInput = scan.next().toLowerCase();
        while (!ALGOS.contains(userInput)) {
            System.out.println("Invalid input.");
            userInput = scan.next().toLowerCase();
        }

        return SorterFactory.getAlgo(userInput);
    }

    public int getDataStructureLength() {
        return dataStructureLength;
    }

    public void setDataStructureLength() {
        UserInput.dataStructureLength = validateNum();
    }

    public boolean isTimeSort() {
        return timeSort;
    }

    public void setTimeSort() {
        UserInput.timeSort = validateBinary();
    }

    public boolean isCompareSort() {
        return compareSort;
    }

    public void setCompareSort() {
        UserInput.compareSort = validateBinary();
    }

    public SortingAlgo getPrimaryAlgo() {
        return primaryAlgo;
    }

    public void setPrimaryAlgo() {
        UserInput.primaryAlgo = validateAlgo();
    }

    public SortingAlgo getSecondaryAlgo() {
        return secondaryAlgo;
    }

    public void setSecondaryAlgo(SortingAlgo secondaryAlgo) {
        UserInput.secondaryAlgo = validateAlgo();
    }
}
