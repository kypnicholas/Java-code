package com.kypnicholas;

/**
 * Created by nkypr on 22/06/2017.
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // CONSTRUCTOR (1) for the Account object. It is auto-generated (and is not visible) but below we overwrite it.
    // TO INITIALISE THE OBJECT WE ARE CREATING. Only ever called once, at the beginning of the objects' initialisation.
    // It is like the pyDefaults Data Transforms in PEGA.
    /* The specific example (1) below using this() is calling another constructor (2). GOOD CODING practices to create one constructor to initialize all values (2) and
    then call it from other constructors (like we called Constructor(2) from Constructor (1))*/
    // It is advised NOT TO call other methods inc. Getters and Setters from constructors
    public Account() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty Account constructor called");
    }

    //CONSTRUCTOR (2) OVER-LOADING (Same constructor method with different arguments)
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with all parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = customerEmailAddress;
        this.phoneNumber = customerPhoneNumber;
    }

    // CONSTRUCTOR (3). We set Account Number and Balance to default values and get all other values from the constructor(2).
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw (double withdrawAmount){
        if (withdrawAmount > this.balance){
            System.out.println("Insufficient Funds. Only " + this.balance + " available. Withdrawal not processed.");
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed, Remaining balance = " + this.balance);
        }

    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
