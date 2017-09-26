package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer printer = new Printer(50, true);
        System.out.println("Toner level is " + printer.getTonerLevel());
        printer.addToner(30);
        System.out.println("New toner level is " + printer.getTonerLevel());

        System.out.println("Initial pages printed count is " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed count is " + pagesPrinted + " and overall printed pages count for the printer is " + printer.getPagesPrinted());
        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed count is " + pagesPrinted + " and overall printed pages count for the printer is " + printer.getPagesPrinted());

    }
}
