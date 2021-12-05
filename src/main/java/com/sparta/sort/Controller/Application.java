package com.sparta.sort.controller;

import com.sparta.sort.view.MainMenu;
import com.sparta.sort.view.PerformanceView;

import java.util.*;

public class Application {
    private MainMenu menu = new MainMenu();
    private SortRunner sortRunner ;
    private UserInput userInput;
    private List unsorterdList;
    private List sortedList;

    public void launch() {
        menu.run();
        if (menu.isComplete()) {
            userInput = menu.getUserInput();
            sortRunner = new SortRunner(userInput.getDataType(), userInput.getDataStructureLength(), userInput.isTimeSort(),
                    userInput.isCompareSort(), userInput.getPrimaryAlgo(), userInput.getSecondaryAlgo());

            if (sortRunner.getList() instanceof ArrayList) unsorterdList = new ArrayList();
            else unsorterdList = new LinkedList();

            unsorterdList.addAll(sortRunner.getList());
            sortedList = sortRunner.sort();
        }

        if (sortRunner.isSorted()) {
            viewController();
        }

    }

    private void viewController() {
        PerformanceView.printArrays(unsorterdList, sortedList);

        PerformanceView.printTimedPerformance(sortRunner.getPrimaryAlgo().getName(),
                sortRunner.getPrimaryAlgo().getSortingTime());
    }
}
