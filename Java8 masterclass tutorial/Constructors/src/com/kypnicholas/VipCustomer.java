package com.kypnicholas;

/**
 * Created by nkypr on 22/06/2017.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // CONSTRUCTOR (1)
    public VipCustomer(){
        this("SpongeBob", 5000.0, "sb@sea.com");
        System.out.println("Empty VipCustomer constructor called");
    }

    // CONSTRUCTOR (2)
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "yo@wassap.com");
    }

    // CONSTRUCTOR (3). Initialise all fields and call from other constructors above
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
