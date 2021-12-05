package com.sparta.sort.model.factory;

import com.sparta.sort.model.generator.ListGenerator;
import java.util.List;

public class ListFactory {
    public static List getList(int length, String dType, String listType) {
        if (length < 0) return null;

        if (dType.equalsIgnoreCase("strings")) {
            List<StringBuilder> list = ListGenerator.strList(listType, length);
            return list;
        } else {
            List<Integer> list = ListGenerator.intList(listType, length);
            return list;
        }
    }
}
