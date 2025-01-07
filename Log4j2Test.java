package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {


    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            //logger.error("An error occurred", e);
            logger.error("something happened",e.getClass()); // 这个地方第一个参数是一个string， 第二个参数是throwable 的exception
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}

