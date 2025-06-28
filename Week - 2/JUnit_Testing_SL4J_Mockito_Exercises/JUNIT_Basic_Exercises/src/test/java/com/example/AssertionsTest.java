package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        assertTrue(5 > 3);  
        assertFalse(3 > 5);
        String str = null;
        assertNull(str);
        String str2 = "Hello";
        assertNotNull(str2);
    }
}
