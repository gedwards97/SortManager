package com.sparta.sort;

public class SorterFactory {
    public static SortingAlgo getAlgo(String algoName) {
        if(algoName.equals("Bubble"))
            return new BubbleSortAlgo();
        else if(algoName.equals("Quick"))
            return new QuickSortAlgo();
        else
            return null;
    }
}
