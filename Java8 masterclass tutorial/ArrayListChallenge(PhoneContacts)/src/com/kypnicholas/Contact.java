package com.kypnicholas;

/**
 * Created by nkypr on 02/07/2017.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //Calling the constructor (we created above) to return a Contact record
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
