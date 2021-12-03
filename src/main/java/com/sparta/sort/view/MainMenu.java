package com.sparta.sort.view;

import com.sparta.sort.controller.UserInput;

public class MainMenu {
    private UserInput userInput = new UserInput();
    private boolean complete = false;

    public void run() {
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

        setComplete(true);
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = true;
    }

    public UserInput getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInput userInput) {
        this.userInput = userInput;
    }
}
