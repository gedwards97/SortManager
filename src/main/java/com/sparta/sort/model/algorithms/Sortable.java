package com.sparta.sort.model.algorithms;

public interface Sortable {
    void swap(int[] arr, int i, int j);
    void sortArray(int[] arr, int start, int end, boolean timing);
}
