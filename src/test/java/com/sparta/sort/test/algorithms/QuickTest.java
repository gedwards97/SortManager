//package com.sparta.sort.test.algorithms;
//
//import com.sparta.sort.model.algorithms.SortingAlgo;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//public class QuickTest {
//    SortingAlgo quick = new QuickSortAlgo();
//
//
//    @DisplayName("Test null input")
//    @Test
//    public void testNullInput() {
//        int[] array = null;
//        quick.sortArray(null, 0, 0 , false);
//        assertNull(array);
//    }
//
//    @DisplayName("Test empty array input")
//    @Test
//    public void testEmptyArray() {
//        int[] array = {};
//        quick.sortArray(array, 0, array.length, false);
//        int[] expected = {};
//        assertArrayEquals(expected, array);
//    }
//
//    @DisplayName("Simple array input")
//    @Test
//    public void testSimpleArray() {
//        int[] array = {2, 3, 1};
//        int[] expected = {1, 2, 3};
//        quick.sortArray(array, 0, array.length, false);
//        assertArrayEquals(expected, array);
//    }
//
//    @DisplayName("Array with negatives")
//    @Test
//    public void testNegatives() {
//        int[] array = {-1, -9, 8, -100};
//        int[] expected = {-100, -9, -1, 8};
//        quick.sortArray(array, 0, array.length, false);
//        assertArrayEquals(expected, array);
//    }
//
//}
