package com.sparta.sort.model;


public class SorterFactory {
    public static SortingAlgo getAlgo(String algoName) {
        if(algoName.equalsIgnoreCase("Bubble"))
            return new BubbleSortAlgo();
        else if(algoName.equalsIgnoreCase("Quick"))
            return new QuickSortAlgo();
        else
            return null;
    }
}
