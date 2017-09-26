package com.kypnicholas;

/**
 * Created by nkypr on 25/06/2017.
 */
public class Printer {
    private int tonerLevel = 100;
    private int noOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.noOfPagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        if (tonerLevel>=0 && tonerLevel<= 100){
            this.tonerLevel = tonerLevel;
        }
    }

    public int addToner(int tonerAmount){
        if (tonerAmount + tonerLevel > 100){
            //System.out.println("You are trying to add more toner than the printer can hold");
            return -1;
        }
        this.tonerLevel += tonerAmount;
        //System.out.println("Toner level increased to " + (tonerAmount + tonerLevel));
        return this.tonerLevel;
    }

    public int printPage(int pagesToPrint){
        if (this.duplex){
            pagesToPrint /=2;
            System.out.println("Printing in duplex mode");
        }
        //System.out.println("Pages are being printed one-sided. Printed " + noOfPagesPrinted + " pages from total of " + pagesToPrint + " pages");
        this.noOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.noOfPagesPrinted;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }


}
