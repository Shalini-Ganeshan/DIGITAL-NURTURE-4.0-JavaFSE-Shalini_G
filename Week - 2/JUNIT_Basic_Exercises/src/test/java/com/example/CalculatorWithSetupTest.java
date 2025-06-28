package com.example;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorWithSetupTest {

    Calculator calc;
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator instance");
        calc = null;
    }

    @Test
    public void testAdd() {
        int a = 10, b = 20;
        int result = calc.add(a, b);
        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }
}
