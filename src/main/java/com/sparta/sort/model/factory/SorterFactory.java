package com.sparta.sort.model.factory;


import com.sparta.sort.model.algorithms.BubbleSortAlgo;
import com.sparta.sort.model.algorithms.QuickSortAlgo;
import com.sparta.sort.model.algorithms.SortingAlgo;

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
