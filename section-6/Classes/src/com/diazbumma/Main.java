package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("911");
        System.out.println(porsche.getModel());
        porsche.setModel("panamera");
        System.out.println(porsche.getModel());
    }
}
