package com.sparta.sort.test.factories;

import com.sparta.sort.model.algorithms.BubbleSortAlgo;
import com.sparta.sort.model.algorithms.QuickSortAlgo;
import com.sparta.sort.model.algorithms.SortingAlgo;
import com.sparta.sort.model.factory.SorterFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AlgorithmsTest {
    @DisplayName("Bubble sort initiation")
    @Test
    public void bubbleInit() {
        SortingAlgo bubble = SorterFactory.getAlgo("bubble");
        assertTrue(bubble instanceof BubbleSortAlgo);
    }

    @DisplayName("Quick sort initiation")
    @Test
    public void quickInit() {
        SortingAlgo quick = SorterFactory.getAlgo("quick");
        assertTrue(quick instanceof QuickSortAlgo);
    }
}
