package com.sparta.sort.view;

import com.sparta.sort.controller.UserInput;

public class Application {
    private UserInput userInput = new UserInput();

    public void launch() {
        System.out.println("--- Welcome to the Sort manager! ---");
        System.out.println("Please enter the size of the data structure you'd like to sort.");
        userInput.setDataStructureLength();
        System.out.println("Would you like to time sorting process? (Y / N)");
        userInput.setTimeSort();
        System.out.println("Would you like to compare two algorithms? (Y / N)");
        userInput.setCompareSort();
        if (!userInput.isCompareSort()) {
            System.out.println("Which sorting algorithm would you like to implement?");
            System.out.println("* Bubble");
            System.out.println("* Quick");
            userInput.setPrimaryAlgo();
        } else {
            System.out.println("SOZ - can't compare algos rn");
        }
    }

    public void singleSort() {

    }

    public void compareSort() {

    }
}
