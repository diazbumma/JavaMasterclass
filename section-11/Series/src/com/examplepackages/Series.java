package com.examplepackages;

public class Series {

    public static long nSum(long n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return n + nSum(n-1);
    }

    public static long factorial(long n) {
        if (n == 0)
            return 1;

        return n * factorial(n-1);
    }

    public static long fibonacci(long n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
