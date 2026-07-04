package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Creating a logger object for this class
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.warn("Application started with a warning.");

        try {

            int number = 100;
            int divisor = 0;

            int result = number / divisor;

            logger.info("Result: {}", result);

        } catch (ArithmeticException e) {

            logger.error("An arithmetic error occurred: {}", e.getMessage());

        }

        logger.warn("Program execution completed.");
    }
}