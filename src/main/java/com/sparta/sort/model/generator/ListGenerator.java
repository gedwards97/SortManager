package com.sparta.sort.model.generator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    private static final Logger logger = LogManager.getLogger(ListGenerator.class);

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

        try {
            int length = random.nextInt(1, 10);
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sb.append(randomChar);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            return sb;
        }
    }

    public static List<StringBuilder> strList(String listType, int length) {
        logger.debug("Generating StringBuilder List");
        List<StringBuilder> list = (List<StringBuilder>) listInitializer(listType);

        try {
            for (int i = 0; i < length; i++) {
                list.add(randStr());
            }
        } catch (IndexOutOfBoundsException e) {
            logger.error(e.getMessage(), e);
        } finally {
            return list;
        }
    }

    public static List<Integer> intList(String listType, int length) {
        logger.debug("GEnerating Integer List");
        List<Integer> list = (List<Integer>) listInitializer(listType);

        try {
            for (int i = 0; i < length; i++) {
                list.add(random.nextInt(100000));
            }
        } catch (IndexOutOfBoundsException e) {
            logger.error(e.getMessage(), e);
        } finally {
            return list;
        }
    }

}
