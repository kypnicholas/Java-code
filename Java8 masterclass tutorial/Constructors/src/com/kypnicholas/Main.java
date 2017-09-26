package com.kypnicholas;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        // In the following two lines I am initializing the Account object. In the first case I call the constructor with no arguments and in the second the other constructor.
        Account NicksAccount = new Account();
        //Account NicksAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com","(087) 123-4567");

        NicksAccount.deposit(150.5);
        NicksAccount.withdraw(100);
        NicksAccount.deposit(100);
        NicksAccount.withdraw(1000);

        Account timsAccount = new Account("Tim", "tim@email.com","12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer Nicholas = new VipCustomer();
        System.out.println(Nicholas.getName());

        VipCustomer Marie = new VipCustomer("Marie", 300);
        System.out.println(Marie.getName());

        VipCustomer Louise = new VipCustomer("Lousie", 300, "a@a.com");
        System.out.println(Louise.getName());
        System.out.println(Louise.getEmailAddress());


    }
}
