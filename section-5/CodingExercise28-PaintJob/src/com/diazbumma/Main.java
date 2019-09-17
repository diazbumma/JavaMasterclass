package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        // sample test case
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("=========");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("=========");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width<=0d || height <= 0d || areaPerBucket <= 0d || extraBucket<0) {
            return -1;
        } else {
            double result = Math.ceil((width*height)/areaPerBucket);
            return ((int) result)-extraBucket;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width<=0d || height <= 0d || areaPerBucket <= 0d) {
            return -1;
        } else {
            double result = Math.ceil((width*height)/areaPerBucket);
            return (int) result;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area<=0d || areaPerBucket<=0d) {
            return -1;
        } else {
            double result = Math.ceil(area/areaPerBucket);
            return (int) result;
        }
    }
}
