package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testA() {
        System.out.println("Test A");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void testB() {
        System.out.println("Test B");
        assertTrue(true);
    }

    @Test
    @Order(3)
    void testC() {
        System.out.println("Test C");
        assertTrue(true);
    }
}
