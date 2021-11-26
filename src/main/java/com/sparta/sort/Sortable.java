package com.sparta.sort;

public interface Sortable {
    void swap(int[] arr, int i, int j);
    void sort(int[] arr, int start, int end, boolean timing);
}
