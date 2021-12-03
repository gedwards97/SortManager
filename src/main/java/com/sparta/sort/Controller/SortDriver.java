package com.sparta.sort.controller;

import com.sparta.sort.view.Application;

import java.util.*;

public class SortDriver {
    public static void main(String[] args) throws Exception {
        Application app = new Application();
        app.launch();
    }

    public static int[] randIntArrayGenerator(int arrayLength) {
        Random random = new Random();
        int[] array = random.ints(arrayLength, 1, 101).toArray();
        return array;
    }
}
