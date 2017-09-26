package com.kypnicholas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a simple interface that allows an object to be saved to some sort of storage medium.
        // The exact type of medium is not known to the interface (nor to the classes that implement it).
        // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
        // and the other to populate the object's fields from an ArrayList.
        //
        // Create some sample classes that implement your saveable interface (we've used the idea of a game,
        // with Players and Monsters, but you can create any type of classes that you want).
        //
        // Override the toString() method for each of your classes so that they can be easily printed to enable
        // the program to be tested easier.
        //
        // In Main, write a method that takes an object that implements the interface as a parameter and
        // "saves" the values.
        // We haven't covered I/O yet, so your method should just print the values to the screen.
        // We haven't covered I/O yet, so your method should just print the values to the screen.
        // Also in Main, write a method that restores the values to a saveable object.
        // Again, we are not going to use Java file I/O; instead use the readValues() method below to
        // simulate getting values from a file – this allows you to type as many values as your class
        // requires, and returns an ArrayList.

        //Declared nick as class type Player instead of ISaveable
        //GENERALLY BETTER TO DECLARE THE OBJECTS AS TYPE OF THE INTERFACE TO MAKE THEM MORE GENERIC UNLESS YOU HAVE STRONG REASON NOT TO DO THAT
        //LIKE IF YOU NEED TO USE THE SPECIFIC FUNCTIONS IN THAT CLASS
        Player nick = new Player("Nick", 100, 100, "sword");
        System.out.println(nick.toString());
        saveObject(nick);

        nick.setHitPoints(90);
        System.out.println(nick.toString());
        saveObject(nick);
        //loadObject(nick);
        System.out.println(nick.toString());

        //Declared dracula as the interface ISaveable
        ISaveable dracula = new Monster("Count", 150, 150);
        System.out.println(dracula.toString());
        saveObject(dracula);

        //dracula.getStrength();              //NOT WORKING even though we have a getStrength() function in the Monster class
        System.out.println(((Monster) dracula).getStrength()); // CAST dracula to type Monster to get over the issue above

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
