package com.kypnicholas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

// WHEN ADDING A NEW ELEMENT INTO AN ARRAYLIST, EVERY OTHER ENTRY AFTER THE POSITION YOU ARE ADDING IT WILL MOVE DOWN.
// LIKEWISE WHEN DELETING AN ELEMENT EVERYTHINF AFTER IT WILL MOVE UP
// FOR SMALL ARRAYLISTS IS OK. FOR LARGE ONES IS A PROBLEM --> THAT IS WHERE *LINKED LISTS* COME IN
        intList.add(1, 2);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

    }
}
