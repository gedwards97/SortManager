package com.sparta.sort.model.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory {
    public static List getList(int[] intArr, String listType) {
        // Determine list
        List list;
        if (listType.toLowerCase().equals("array")) {
            list = new ArrayList<Integer>(intArr.length);
        } else if (listType.toLowerCase().equals("linked")){
            list = new LinkedList<Integer>();
        } else {
            return null;
        }

        // Fill list
        for (int i : intArr) {
            list.add(i);
        }

        // Return list
        return list;
    }
}
