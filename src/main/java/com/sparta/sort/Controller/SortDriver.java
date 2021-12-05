package com.sparta.sort.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortDriver {
    private static final Logger logger = LogManager.getLogger(SortRunner.class);

    public static void main(String[] args) throws Exception {
        logger.debug("Running application.");
        Application app = new Application();
        app.launch();
    }
}
