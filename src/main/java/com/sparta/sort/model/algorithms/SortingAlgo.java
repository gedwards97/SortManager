package com.sparta.sort.model.algorithms;

import com.sparta.sort.model.tools.Stopwatch;

import java.util.List;

public abstract class SortingAlgo {
    private String name;
    public Stopwatch timer = new Stopwatch();

    public abstract String getName();

    public long getSortingTime(){
        return this.timer.getElapsedNanoseconds();
    }
}
