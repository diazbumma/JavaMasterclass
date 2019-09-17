package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number<2) {
            return -1;
        } else {
            int largest = -1;
            for (int i=1; i<=Math.sqrt(number); i++) {
                if (number%i==0) {
                    int temp = number/i;
                    for (int j=2; j<=temp; j++) {
                        while (temp%j==0) {
                            if (j > largest) {
                                largest = j;
                            }
                            temp /= j;
                        }
                    }
                }
            }
            return largest;
        }
    }
}
