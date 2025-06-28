package main.java.com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.info("Info log to console and file");
        logger.warn("Warning log to console and file");
        logger.error("Error log to console and file");
    }
}
