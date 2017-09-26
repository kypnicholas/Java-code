package com.kypnicholas;

/**
 * Created by nkypr on 25/06/2017.
 */
public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Rye");
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }



    @Override
    public double personalizeHamburger() {
        double healthyHamburgerPrice = super.personalizeHamburger();
        if (this.healthyExtra1Name != null){
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price + ". Only available for the Healthy burger");
        }
        if (this.healthyExtra2Name != null){
            healthyHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price + ". Only available for the Healthy burger");
        }
        return healthyHamburgerPrice;
    }
}
