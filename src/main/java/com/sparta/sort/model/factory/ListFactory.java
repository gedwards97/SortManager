package com.sparta.sort.model.factory;

import com.sparta.sort.model.generator.ListGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ListFactory {
    private static final Logger logger = LogManager.getLogger(ListFactory.class);

    public static List getList(int length, String dType, String listType) {
        if (length < 0) return null;

        try {
            if (dType.equalsIgnoreCase("strings")) {
                List<StringBuilder> list = ListGenerator.strList(listType, length);
                return list;
            } else {
                List<Integer> list = ListGenerator.intList(listType, length);
                return list;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return null;
    }
}
