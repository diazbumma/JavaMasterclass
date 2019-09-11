package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(3, 0, 15));
    }

    //bigBag = 5 kilos each
    //smallBag = 1 kilo each
    //goal = amount of kilos of flour needed to assemble a package

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount<0 || smallCount<0 || goal<0) {
            return false;
        } else {
            while (goal>0) {
                if (goal>=5 && bigCount!=0) {
                    goal -= 5;
                    bigCount--;
                } else if (smallCount!=0) {
                    goal--;
                    smallCount--;
                }

                if ((goal==0) || (smallCount==0 && (goal<5))) {
                    break;
                }
            }
            return (goal==0);
        }
    }
}
