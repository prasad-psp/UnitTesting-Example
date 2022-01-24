package com.psp.unittesting_example;

import junit.framework.TestCase;

import org.junit.Test;

public class FactorialTest extends TestCase {

    @Test
    public void testFactorial() {
        //assertEquals(1.0, Factorial.factorial(2),0.0213); Failed
        assertEquals(1.0, Factorial.factorial(1),0.0213); // Passed
        assertEquals(120.0, Factorial.factorial(5), 0.0);
    }
}