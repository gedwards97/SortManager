package com.sparta.sort;
public class QuickSortAlgo extends SortingAlgo {
    private String name = "Quick sort";
    private Stopwatch timer = new Stopwatch();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSortingTime(){
        return this.timer.getElapsedNanoseconds();
    }

    public int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return (i + 1);
    }

    public void sort(int[] arr, int low, int high, boolean timing) {
        if (timing) timer.start();
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1, false);
            sort(arr, pi + 1, high, false);
        }
        if (timing) timer.stop();
    }
}
