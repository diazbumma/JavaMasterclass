package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;
        for (int i=1;i<=1000;i++) {
            if (count == 5) {
                System.out.println("Sum 3 and 5 result: " + sum);
                break;
            }
            if ((i%3==0) && (i%5==0)) {
                System.out.println("Number can be divided by 3 and 5: " + i);
                sum += i;
                count++;
            }
        }
    }
}
