package com.sparta.sort.model.algorithms;

import com.sparta.sort.model.tools.Stopwatch;

public class BubbleSortAlgo extends SortingAlgo implements Sortable {
    private String name = "Bubble sort";
    private Stopwatch timer = new Stopwatch();

    public String getName(){
        return this.name;
    }

    public long getSortingTime(){
        return this.timer.getElapsedNanoseconds();
    }

    public void sortArray(int arr[], int start, int end, boolean timing) {
        if (timing) timer.start();
        for (int i = start; i < end; i++)
            for (int j = start; j < end-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    this.swap(arr, j, j+1);
                }
        if (timing) timer.stop();
    }
}
