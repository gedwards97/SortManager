package com.sparta.sort.controller;

import com.sparta.sort.model.algorithms.BubbleSort;
import com.sparta.sort.model.algorithms.QuickSort;
import com.sparta.sort.model.algorithms.SortingAlgo;
import com.sparta.sort.model.algorithms.TreeSort;
import com.sparta.sort.model.factory.ListFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SortRunner {
    private static final Logger logger = LogManager.getLogger(SortRunner.class);

    private int dataStructureLength;
    private boolean timedSort;
    private boolean compareSort;
    private SortingAlgo primaryAlgo;
    private SortingAlgo secondaryAlgo;
    private List list;
    private boolean sorted;


    public SortRunner(String dataType, int dataStructureLength, boolean timedSort, boolean compareSort,
                      SortingAlgo primaryAlgo, SortingAlgo secondaryAlgo) {
        this.dataStructureLength = dataStructureLength;
        this.timedSort = timedSort;
        this.compareSort = compareSort;
        this.primaryAlgo = primaryAlgo;
        this.secondaryAlgo = secondaryAlgo;
        // Create data and list type options in user input.
        this.list = ListFactory.getList(dataStructureLength, dataType, "array");
        this.sorted = false;
    }

    public List sort() {
        logger.debug("Sorting list.");
        sorted = true;
        try {
            if (primaryAlgo instanceof TreeSort) {
                list = ((TreeSort<?>) primaryAlgo).sort(this.list, timedSort);
            } else if (primaryAlgo instanceof BubbleSort) {
                list = ((BubbleSort<?>) primaryAlgo).sort(this.list, timedSort);
            }
            else {
                ((QuickSort<?>) primaryAlgo).setList(list);
                list = ((QuickSort<?>) primaryAlgo).sort(0, this.dataStructureLength, timedSort);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return list;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public SortingAlgo getPrimaryAlgo() {
        return primaryAlgo;
    }

    public void setPrimaryAlgo(SortingAlgo primaryAlgo) {
        this.primaryAlgo = primaryAlgo;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }
}