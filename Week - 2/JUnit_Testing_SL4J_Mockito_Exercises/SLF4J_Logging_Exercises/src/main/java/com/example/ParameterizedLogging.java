package main.java.com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String user = "John";
        int id = 1001;

        logger.info("User {} has logged in with id {}", user, id);
        logger.warn("User {} attempted {} times", user, 3);
    }
}
