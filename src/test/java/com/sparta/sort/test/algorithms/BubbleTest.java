package com.sparta.sort.test.algorithms;

import com.sparta.sort.model.algorithms.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class BubbleTest {
    BubbleSort bubble = new BubbleSort();

    @DisplayName("Test null input")
    @Test
    public void testNullInput() {
        List sorted = bubble.sort(null, false);
        assertNull(sorted);
    }

    @DisplayName("Test empty array list")
    @Test
    public void testEmptyArrayList() {
        List expected = new ArrayList<>();
        List sorted = bubble.sort(expected, false);
        assertEquals(expected, sorted);
    }

    @DisplayName("Test empty linked list")
    @Test
    public void testEmptyLinkedList() {
        List expected = new LinkedList();
        List sorted = bubble.sort(expected, false);
        assertEquals(expected, sorted);
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

        List result = bubble.sort(list, false);
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

        List result = bubble.sort(list, false);
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

        List result = bubble.sort(list, false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }

    @DisplayName("Simple string linked list")
    @Test
    public void testSimpleArray() {
        List list = new LinkedList();
        List expected = new LinkedList();

        list.add("pepper");
        list.add("george");
        list.add("abba");

        expected.addAll(list);

        List result = bubble.sort(list, false);
        Collections.sort(expected);

        assertEquals(expected, result);
    }
}
