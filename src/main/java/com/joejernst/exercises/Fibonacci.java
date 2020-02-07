package com.joejernst.exercises;

/**
 * Methods for traversing a Fibonacci sequence
 *
 * @author JoeJErnst
 */
public class Fibonacci {

    /**
     * Returns the nth number (zero-based) in a Fibonacci sequence beginning with 0,1.  Remember, each number a Fibonacci sequence is the
     * sum of the two previous numbers.
     *
     * Fibonacci sequence: 0,1,1,2,3,5,8,13...
     *                 n = 0,1,2,3,4,5,6,7...
     *
     * @param n The position you want returned
     * @return The int value contained in the nth position of the sequence
     */
    public static long findNthNumber(int n) {
        if(n < 0) throw new IllegalArgumentException("You must provide a positive integer");

        // Return immediately for first two values because n = result for 0 and 1
        if (n <= 1) return n;

        long a = 0, b = 1, c;

        for(int i = 2; i <= n; i++) {
            c = a+b; // calculate the value for this position

            // Integer overflow
            if(c < 0) throw new IllegalArgumentException("n is too big");

            // Move the pointers ahead one
            a = b;
            b = c;
        }

        return b;
    }
}
