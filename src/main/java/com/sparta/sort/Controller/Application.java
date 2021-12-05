package com.sparta.sort.controller;

import com.sparta.sort.view.MainMenu;
import com.sparta.sort.view.PerformanceView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Application {
    private static final Logger logger = LogManager.getLogger(Application.class);

    private MainMenu menu = new MainMenu();
    private SortRunner sortRunner ;
    private UserInput userInput;
    private List unsorterdList;
    private List sortedList;

    public void launch() {
        menu.run();
        if (menu.isComplete()) {
            logger.debug("Retrieving user input.");
            userInput = menu.getUserInput();

            logger.debug("Instantiating sortRunner");
            try {
                sortRunner = new SortRunner(userInput.getDataType(), userInput.getDataStructureLength(), userInput.isTimeSort(),
                        userInput.isCompareSort(), userInput.getPrimaryAlgo(), userInput.getSecondaryAlgo());

                if (sortRunner.getList() instanceof ArrayList) unsorterdList = new ArrayList();
                else unsorterdList = new LinkedList();

                unsorterdList.addAll(sortRunner.getList());
                sortedList = sortRunner.sort();
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
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
