package com.sparta.sort.test.factories;

import com.sparta.sort.model.algorithms.BubbleSort;
import com.sparta.sort.model.algorithms.QuickSort;
import com.sparta.sort.model.algorithms.SortingAlgo;
import com.sparta.sort.model.algorithms.TreeSort;
import com.sparta.sort.model.factory.SorterFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AlgorithmsTest {
    @DisplayName("Bubble sort initiation")
    @Test
    public void bubbleInit() {
        SortingAlgo bubble = SorterFactory.getAlgo("bubble");
        assertTrue(bubble instanceof BubbleSort);
    }

    @DisplayName("Quick sort initiation")
    @Test
    public void quickInit() {
        SortingAlgo quick = SorterFactory.getAlgo("quick");
        assertTrue(quick instanceof QuickSort);
    }

    @DisplayName("Quick sort initiation")
    @Test
    public void treeIniy() {
        SortingAlgo tree = SorterFactory.getAlgo("tree");
        assertTrue(tree instanceof TreeSort);
    }
}
