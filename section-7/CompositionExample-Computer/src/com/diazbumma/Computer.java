package com.diazbumma;

public class Computer {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private Processor processor;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard, Processor processor) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.processor = processor;
    }

    public void powerUp() {
        theCase.pressPowerButton(monitor);
        showLogo();
    }

    private void showLogo() {
        int xPos = monitor.getResolution().getHorizontal() / 2;
        int yPos = monitor.getResolution().getVertical() / 2;
        monitor.drawPixelAt(xPos, yPos, "Blue");
    }

    public void showText(String text) {
        monitor.displayText(text);
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Computer info: \n"
                + "Case: " + theCase.getBrand() + " " + theCase.getModel() + "\n"
                + "Monitor: " + monitor.getBrand() + " " + monitor.getModel() + "\n"
                + "Motherboard: " + motherboard.getBrand() + " " + motherboard.getModel() + "\n"
                + "Processor: " + processor.getBrand() + " " + processor.getModel();
    }
}
