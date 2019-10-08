package com.diazbumma;

public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void refill(int amountOfToner) {
        if (amountOfToner>0 && amountOfToner<=(100-tonerLevel)) {
            tonerLevel += amountOfToner;
        } else if (amountOfToner>(100-tonerLevel)){
            tonerLevel = 100;
        }
    }

    public void doPrint(int pages) {
        System.out.println("Printer is printing..");

        //assuming every full toner can print for 3000 pages
        if ((int)((double)pages/3000d*100d) >= tonerLevel) {
            int remainingPages = ((pagesPrinted%3000)+pages)>3000 ? ((pagesPrinted%3000)+pages)-3000 : ((pagesPrinted%3000)+pages);
            pagesPrinted += (pages-remainingPages);
            tonerLevel = 0;
            if (remainingPages == 0){
                System.out.println(pages + " pages has been printed");
                return;
            }
            System.out.println("Toner is empty.., " + remainingPages + " pages remaining is not printed. Please refill.");
            return;
        }
        pagesPrinted += pages;
        tonerLevel -= (int)(((double)(pagesPrinted%3000))/3000d*100d);
        System.out.println(pages + " pages has been printed");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
