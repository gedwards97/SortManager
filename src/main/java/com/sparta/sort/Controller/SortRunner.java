package com.sparta.sort.controller;

import com.sparta.sort.model.algorithms.SortingAlgo;
import com.sparta.sort.model.generator.ArrayGenerator;

public class SortRunner {
    private static int dataStructureLength;
    private static boolean timeSort;
    private static boolean compareSort;
    private static SortingAlgo primaryAlgo;
    private static SortingAlgo secondaryAlgo;
    private static int[] array;
    private static boolean sorted;


    public SortRunner(int initLength, boolean initTimed, boolean initCompare,
                      SortingAlgo initPrimary, SortingAlgo initSecondary) {
        dataStructureLength = initLength;
        timeSort = initTimed;
        compareSort = initCompare;
        primaryAlgo = initPrimary;
        secondaryAlgo = initSecondary;
        array = ArrayGenerator.generate(dataStructureLength);
        sorted = false;
    }

    public void sort() {
        setArray(ArrayGenerator.generate(dataStructureLength));
        primaryAlgo.sortArray(array, 0 , dataStructureLength-1, timeSort);
        sorted = true;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        SortRunner.array = array;
    }

    public SortingAlgo getPrimaryAlgo() {
        return primaryAlgo;
    }

    public void setPrimaryAlgo(SortingAlgo primaryAlgo) {
        SortRunner.primaryAlgo = primaryAlgo;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        SortRunner.sorted = sorted;
    }
}
