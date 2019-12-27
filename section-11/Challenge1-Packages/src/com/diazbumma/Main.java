package com.diazbumma;

import com.examplepackages.Series;

public class Main {

    // Create a suitably named package containing a class called Series
    // with the following static methods:
    // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
    // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
    //
    // factorial(int n) returns the product of all numbers from 1 to n
    //      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
    // The first 10 factorials are:
    // 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
    //
    // fibonacci(n) returns the nth Fibonacci number. These are defined as:
    // f(0) = 0
    // f(1) = 1
    // f(n) = f(n-1) + f(n-2)
    // (so f(2) is also 1. The first 10 fibonacci numbers are:
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
    //
    // When you have tested your functions, delete the Main class and
    // produce a jar file.
    //
    // Create a new project and add your Series library, then test the
    // three methods in the main() method of your new project.

    public static void main(String[] args) {
        System.out.println("Sum series");
        for (int i = 0; i <= 10; i++) {
            if (i != 10)
                System.out.print(Series.nSum(i) + ", ");
            else
                System.out.println(Series.nSum(i));
        }

        System.out.println("\nFactorial series");
        for (int i = 0; i <= 10; i++) {
            if (i != 10)
                System.out.print(Series.factorial(i) + ", ");
            else
                System.out.println(Series.factorial(i));
        }

        System.out.println("\nFibonacci series");
        for (int i = 0; i <= 10; i++) {
            if (i != 10)
                System.out.print(Series.fibonacci(i) + ", ");
            else
                System.out.println(Series.fibonacci(i));
        }
    }
}
