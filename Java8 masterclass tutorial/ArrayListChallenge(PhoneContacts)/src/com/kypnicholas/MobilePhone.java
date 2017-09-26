package com.kypnicholas;
import java.util.ArrayList;
/**
 * Created by nkypr on 02/07/2017.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new  ArrayList<Contact>();        //initializing our arraylist in the constructor.
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName())>=0){
            System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundContact = findContact(oldContact);
        if (foundContact<0){
            System.out.println(oldContact.getName() + " could not be found");
            return false;
        }
        this.myContacts.set(foundContact, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean remove(Contact contact){
        int foundContact = findContact(contact);
        if (foundContact<0){
            System.out.println(contact.getName() + " could not be found");
            return false;
        }
        this.myContacts.remove(foundContact);
        System.out.println(contact.getName() + " has been removed.");
        return true;
    }

    private int findContact(Contact contact){               // #1 returns an integer showing the position in the array for that particular contact we passed as argument
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {           // #2 loop through all contacts and extract the name. if it matches to the argument we passed return the position in the arraylist
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contact contact){           // In continuation to the 2 findContact() above, this method will be used to return the name of the contact if found, otherwise return null
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact (String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List. Total of " + this.myContacts.size() + " in the list" );
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }


}
