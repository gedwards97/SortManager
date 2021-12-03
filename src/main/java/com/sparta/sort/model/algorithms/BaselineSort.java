package com.sparta.sort.model.algorithms;

import com.sparta.sort.model.tools.Stopwatch;

import java.util.Collections;
import java.util.List;

public class BaselineSort {
    private String name = "Collections.sort()";
    private Stopwatch timer = new Stopwatch();

    public String getName(){
        return this.name;
    }

    public long getSortingTime(){
        return this.timer.getElapsedNanoseconds();
    }

    public void sortList(List list, boolean timing) {
        if (timing) timer.start();
        Collections.sort(list);
        if (timing) timer.stop();
    }
}
