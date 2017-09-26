package com.kypnicholas;

/**
 * Created by nkypr on 25/06/2017.
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "veal", 12, "White roll");
        super.addHamburgerAddition1("Chips",1.25);
        super.addHamburgerAddition2("Drink",0.99);
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public double personalizeHamburger() {
        double deluxeHamburgerPrice = super.personalizeHamburger();
        return deluxeHamburgerPrice;
    }

}

