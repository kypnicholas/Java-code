package com.kypnicholas;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("BOC");

        bank.addBranch("Agios Dometios");

        bank.addCustomer("Agios Dometios", "Nick", 50.5);
        bank.addCustomer("Agios Dometios", "Maria", 90.8);
        bank.addCustomer("Agios Dometios", "Stauros", 147.5);

        bank.addBranch("Frankfurt");
        bank.addCustomer("Frankfurt", "Marie Louise", 45);

        bank.addCustomerTransaction("Agios Dometios", "Nick", 5);
        bank.addCustomerTransaction("Agios Dometios", "Stauros", 12);

        bank.listCustomers("Agios Dometios", true);
        bank.listCustomers("Frankfurt", false);

        if(!bank.addCustomer("Engomi", "Brian", 5.53)) {
            System.out.println("Error Engomi branch does not exist");
        }

        if(!bank.addBranch("Agios Dometios")) {
            System.out.println("Agios Dometios branch already exists");
        }

        if(!bank.addCustomerTransaction("Agios Dometios", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

    }
}
