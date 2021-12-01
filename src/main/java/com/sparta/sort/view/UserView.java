package com.sparta.sort.view;

import com.sparta.sort.model.SorterFactory;
import com.sparta.sort.model.SortingAlgo;
import com.sparta.sort.view.PerformanceView;

import java.util.Scanner;

public class UserView {
    /*
    This is a class to manage the user's interactions with the sort manager.
    Key functionalities include taking user inputs, and returning info in
    the correct format to interact with model and view packages.
     */
    private SortingAlgo primarySorter;
    private PerformanceView view = new PerformanceView();
    private boolean timing;
    private Scanner scan = new Scanner(System.in);
    private int length;

    public void launch() throws Exception {
        // Array Size
        System.out.println("How many elements would you like the data structure to contain? ( > 0 )");
        int lengthInput = scan.nextInt();
        setLength(lengthInput);

        // Timer
        System.out.println("Would you like to time your algorithm? (Y / N)");
        String timingInput = scan.next();
        setTiming(timingInput);

    }

    public void setTiming(String timingInput) {
        while ((!timingInput.equals("Y")) && (!timingInput.equals("N"))) {
            System.out.println("Invalid input.");
            timingInput = scan.next();
        }

        if (timingInput.equals("Y"))
            this.timing = true;
        else
            this.timing = false;
    }

    public void setLength(int length) {
        while (length <= 0) {
            System.out.println("Invalid input");
            length = scan.nextInt();
        }
        this.length = length;
    }

    public void setAlgorithm(String algoName) {
        this.primarySorter = SorterFactory.getAlgo(algoName);
    }

    public void runSort(int[] array) {
        this.primarySorter.sortArray(array, 0, array.length-1, this.timing);
    }

    public void timedView() {
        this.view.printTimedPerformance(this.primarySorter.getName(), this.primarySorter.getSortingTime());
    }
}
