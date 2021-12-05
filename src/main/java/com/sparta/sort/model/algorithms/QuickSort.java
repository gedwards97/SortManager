package com.sparta.sort.model.algorithms;

import com.sparta.sort.model.tools.Stopwatch;

import java.util.Collections;
import java.util.List;

public class QuickSort<T extends Comparable<T>> extends SortingAlgo{
    private String name = "Quick sort";
    List<T> list;
    public String getName() {
        return this.name;
    }

    public int partition(List<T> list, int low, int high)
    {
        T pivot = list.get(high);
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);

        return (i + 1);
    }

    public List<T> sort(int low, int high, boolean timing) {
        high -= 1;

        if (timing) super.timer.start();
        if (low < high) {
            int pi = partition(list, low, high);

            sort(low, pi, false);
            sort(pi + 1, high + 1, false);
        }
        if (timing) super.timer.start();

        return list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}