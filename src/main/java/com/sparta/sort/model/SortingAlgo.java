package com.sparta.sort.model;

import com.sparta.sort.model.Sortable;
import com.sparta.sort.model.Stopwatch;

public abstract class SortingAlgo implements Sortable {
    private String name;
    private Stopwatch timer;

    public abstract String getName();

    public void swap(int[] arr, int i, int j){
        int dummy = arr[i];
        arr[i] = arr[j];
        arr[j] = dummy;
    }

    public abstract void sortArray(int[] arr, int i, int j, boolean timing);

    public abstract long getSortingTime();
}
