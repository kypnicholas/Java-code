package com.kypnicholas;

import java.util.ArrayList;

/**
 * Created by nkypr on 08/07/2017.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();            //initialise transactions
        addTransaction(initialAmount);                          //handle the initial amount
    }

    public void addTransaction(double amount){
        transactions.add(amount);                   //demonstrating Autoboxing - converted amount from primitive double to object Double to store into the ArrayList
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
