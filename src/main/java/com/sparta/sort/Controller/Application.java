package com.sparta.sort.controller;

import com.sparta.sort.view.MainMenu;
import com.sparta.sort.view.PerformanceView;

import java.util.Arrays;

public class Application {
    private static MainMenu menu = new MainMenu();
    private static SortRunner sortRunner ;
    private static UserInput userInput;
    private static int[] unsorterdArray;
    private static int[] sortedArray;

    public void launch() {
        menu.run();
        if (menu.isComplete()) {
            userInput = menu.getUserInput();
            sortRunner = new SortRunner(userInput.getDataStructureLength(), userInput.isTimeSort(),
                    userInput.isCompareSort(), userInput.getPrimaryAlgo(), userInput.getSecondaryAlgo());
            unsorterdArray = sortRunner.getArray();
            sortRunner.sort();
            sortedArray = sortRunner.getArray();
        }

        if (sortRunner.isSorted()) {
            viewController();
        }

    }

    private void viewController() {
        PerformanceView.printArrays(unsorterdArray, sortedArray);
        PerformanceView.printTimedPerformance(sortRunner.getPrimaryAlgo().getName(),
                sortRunner.getPrimaryAlgo().getSortingTime());
    }
}
