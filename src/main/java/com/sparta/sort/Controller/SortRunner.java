package com.sparta.sort.controller;

import com.sparta.sort.model.algorithms.BubbleSort;
import com.sparta.sort.model.algorithms.QuickSort;
import com.sparta.sort.model.algorithms.SortingAlgo;
import com.sparta.sort.model.algorithms.TreeSort;
import com.sparta.sort.model.factory.ListFactory;
import com.sparta.sort.model.generator.ArrayGenerator;
import com.sparta.sort.model.generator.ListGenerator;

import java.util.List;

public class SortRunner<T> {
    private int dataStructureLength;
    private boolean timeSort;
    private boolean compareSort;
    private SortingAlgo primaryAlgo;
    private SortingAlgo secondaryAlgo;
    private int[] array;
    private List list;
    private boolean sorted;


    public SortRunner(String dataType, int dataStructureLength, boolean initTimed, boolean initCompare,
                      SortingAlgo initPrimary, SortingAlgo initSecondary) {
        this.dataStructureLength = dataStructureLength;
        timeSort = initTimed;
        compareSort = initCompare;
        primaryAlgo = initPrimary;
        secondaryAlgo = initSecondary;
        array = ArrayGenerator.generate(dataStructureLength);
        // Create data and list type options in user input.
        list = ListFactory.getList(dataStructureLength, dataType, "array");
        sorted = false;
    }

    public List sort() {
        sorted = true;
        if (primaryAlgo instanceof TreeSort)
            return ((TreeSort<?>) primaryAlgo).sort(list, timeSort);
        else if (primaryAlgo instanceof BubbleSort)
            return ((BubbleSort<?>) primaryAlgo).sort(list, timeSort);
        else {
            ((QuickSort<?>) primaryAlgo).setList(list);
            return ((QuickSort<?>) primaryAlgo).sort(0, this.dataStructureLength, timeSort);
        }
    }

    public List getList() {
        return list;
    }

    public void setArray(int[] array) {
        this.array = array;
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