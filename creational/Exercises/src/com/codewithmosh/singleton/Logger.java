package com.codewithmosh.singleton;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;

    private static Map<String, Logger> loggers = new HashMap<>();

    public static Logger getInstance(String fileName) {
        if(!loggers.containsKey(fileName))
            loggers.put(fileName, new Logger(fileName));

        return loggers.get(fileName);
    }

    private Logger(String fileName) {
        this.fileName = fileName;
    }


    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
