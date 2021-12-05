package com.sparta.sort.controller;

import com.sparta.sort.model.algorithms.BubbleSort;
import com.sparta.sort.model.algorithms.TreeSort;
import com.sparta.sort.model.factory.ListFactory;
import com.sparta.sort.model.generator.ListGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortDriver {
    public static void main(String[] args) throws Exception {
        Application app = new Application();
        app.launch();
    }
}
