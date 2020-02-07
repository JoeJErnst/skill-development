package com.joejernst.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTests {

    @Test
    public void testFirstTwoPositions() {
        assertEquals(0, Fibonacci.findNthNumber(0));
        assertEquals(1, Fibonacci.findNthNumber(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        Fibonacci.findNthNumber(-1);
    }

    @Test
    public void testKnownGoodValues() {
        assertEquals(2, Fibonacci.findNthNumber(3));
        assertEquals(3, Fibonacci.findNthNumber(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReallyBigN() {
        long result = Fibonacci.findNthNumber(10000);
        System.out.println(result);

        assertTrue(result > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLowerLimit() {
        Fibonacci.findNthNumber(Integer.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpperLimit() {
        Fibonacci.findNthNumber(Integer.MAX_VALUE);
    }
}
