package com.sparta.sort.model.factory;


import com.sparta.sort.model.algorithms.*;

public class SorterFactory {
    public static SortingAlgo getAlgo(String algoName) {
        if(algoName.equalsIgnoreCase("Bubble"))
            return new BubbleSort();
        else if(algoName.equalsIgnoreCase("Quick"))
            return new QuickSort();
        else if (algoName.equalsIgnoreCase("Tree"))
            return new TreeSort();
        else
            return null;
    }
}
