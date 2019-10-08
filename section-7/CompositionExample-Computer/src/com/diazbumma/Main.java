package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        //dimension declared in inch
	    Case theCase = new Case("thermaltake",
                "Level 20 GT ARGB Black Edition",
                new Dimension(22.9, 11.6, 23.3));
	    Motherboard motherboard = new Motherboard("ASUS",
                "Level 20 GT ARGB Black Edition",
                "Intel Z390");
	    Processor processor = new Processor("Intel", "i9-9900T ", 2.10, 8);
	    Monitor monitor = new Monitor("ASUS",
                "Asus ROG Swift PG27UQ",
                new Resolution(3840, 2160),
                new Dimension(634, 437));
	    Computer myComputer = new Computer(theCase, monitor, motherboard, processor);

	    //show information case width
        System.out.println("Computer case width: " + myComputer.getTheCase().getDimension().getWidth());

        //show general computer information
        System.out.println(myComputer.toString());

        //do something with the computer
        myComputer.powerUp();
        myComputer.showText("Lorem Ipsum");
    }
}
