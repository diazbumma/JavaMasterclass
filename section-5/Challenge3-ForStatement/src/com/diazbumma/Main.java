package com.diazbumma;

public class Main {

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit

    public static void main(String[] args) {

        int count = 0;

        for (int i=1; i<=100; i++) {
            if (isPrime(i)) {
                System.out.println("prime: " + i);
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
