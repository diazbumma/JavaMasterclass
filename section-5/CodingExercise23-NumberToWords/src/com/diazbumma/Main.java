package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(1234);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += (number % 10);
            number /= 10;
        }
        return reversed;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int digitCount = getDigitCount(number);
            number = reverse(number);
            int digitCountReverse = getDigitCount(number);
            while (number != 0) {
                int dig = (number % 10);
                switch (dig) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number /= 10;
            }
            if (digitCount != digitCountReverse) {
                for (int i=0; i<(digitCount-digitCountReverse); i++) {
                    System.out.println("Zero");
                }
            }
        }
    }
}
