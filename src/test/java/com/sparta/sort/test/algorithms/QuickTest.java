package com.sparta.sort.test.algorithms;

import com.sparta.sort.model.algorithms.BubbleSort;
import com.sparta.sort.model.algorithms.QuickSort;
import com.sparta.sort.model.algorithms.SortingAlgo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickTest {
    QuickSort quick = new QuickSort();

    @DisplayName("Test null input")
    @Test
    public void testNullInput() {
        List list = null;
        quick.setList(list);
        List sorted = quick.sort(0, 0, false);
        assertNull(sorted);
    }

    @DisplayName("Test empty array list")
    @Test
    public void testEmptyArrayList() {
        List list = new ArrayList();
        quick.setList(list);
        List sorted = quick.sort(0, list.size(), false);
        assertEquals(list, sorted);
    }

    @DisplayName("Test empty linked list")
    @Test
    public void testEmptyLinkedList() {
        List list = new LinkedList();
        quick.setList(list);
        List sorted = quick.sort(0, list.size(), false);
        assertEquals(list, sorted);
    }

    @DisplayName("Simple int array list")
    @Test
    public void testSimpleArrayList() {
        List list = new ArrayList();
        List expected = new ArrayList();

        list.add(6);
        list.add(-3);
        list.add(5);

        expected.addAll(list);

        quick.setList(list);
        List result = quick.sort(0, list.size(), false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }

    @DisplayName("Simple int linked list")
    @Test
    public void testSimpleLinkedList() {
        List list = new LinkedList();
        List expected = new LinkedList();

        list.add(6);
        list.add(-3);
        list.add(5);

        expected.addAll(list);

        quick.setList(list);
        List result = quick.sort(0, list.size(), false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }

    @DisplayName("Simple string array list")
    @Test
    public void simpleStringArrayList() {
        List list = new ArrayList();
        List expected = new ArrayList();

        list.add("pepper");
        list.add("george");
        list.add("abba");

        expected.addAll(list);

        quick.setList(list);
        List result = quick.sort(0, list.size(), false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }

    @DisplayName("Simple string array list")
    @Test
    public void simpleStringLinkedList() {
        List list = new LinkedList();
        List expected = new LinkedList();

        list.add("pepper");
        list.add("george");
        list.add("abba");

        expected.addAll(list);

        quick.setList(list);
        List result = quick.sort(0, list.size(), false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }
}
