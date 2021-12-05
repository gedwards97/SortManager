package com.sparta.sort.model.algorithms;

import com.sparta.sort.model.tools.Stopwatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> extends SortingAlgo {
    private static final Logger logger = LogManager.getLogger(BubbleSort.class);

    private String name = "Bubble sort";
    private Stopwatch timer = new Stopwatch();

    public String getName(){
        return this.name;
    }

    public List<T> sort(List<T> list, boolean timing) {
        if (list == null) return null;

        try {
            if (timing) super.timer.start();
            for (int i = 0; i < list.size(); i++)
                for (int j = 0; j < list.size()-i-1; j++)
                    if (list.get(j).compareTo(list.get(j+1)) > 0)
                        Collections.swap(list, j, j+1);
            if (timing) super.timer.stop();
            return list;

        } catch (IndexOutOfBoundsException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}


