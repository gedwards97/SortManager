package com.sparta.sort.model.generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    private static Random random = new Random();
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";


    private static List listInitializer(String listType) {
        if (listType.equalsIgnoreCase("array"))
            return new ArrayList<>();
        else
            return new LinkedList<>();
    }

    private static StringBuilder randStr() {
        StringBuilder sb = new StringBuilder();

        int length = random.nextInt(1, 10);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return sb;
    }

    public static List<StringBuilder> strList(String listType, int length) {
        List<StringBuilder> list = (List<StringBuilder>) listInitializer(listType);

        for (int i = 0; i < length; i++) {
            list.add(randStr());
        }

        return list;
    }

    public static List<Integer> intList(String listType, int length) {
        List<Integer> list = (List<Integer>) listInitializer(listType);

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(100000));
        }

        return list;
    }

}
