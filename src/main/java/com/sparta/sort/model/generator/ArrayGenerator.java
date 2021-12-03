package com.sparta.sort.model.generator;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generate(int arrayLength) {
        Random random = new Random();
        int[] array = random.ints(arrayLength, 1, 10001).toArray();
        return array;
    }
}
