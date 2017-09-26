package com.kypnicholas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  GroceryList groceryList = new GroceryList();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the item you want to add: ");
        // scanner.nextLine(): Advances this scanner past the current line and returns the input that was skipped.
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        // scanner.nextInt(): Scans the next token of the input as an int and returns the int.
        System.out.print("Enter item name to modify: ");
        String itemToReplace = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemToReplace, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name to remove: ");
        String itemToRemove = scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in  our grocery list");
        }
        else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    //Another method to copy an array list into a new one
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());                                          //Method 1: adds all items from the groceryList into the newArray

        ArrayList<String> newArray2 = new ArrayList<String>(groceryList.getGroceryList());      //Method 2: same as method 1 but the copying happens at the time of initialising the newArray2

        //if for some reason you want to save all the contents of an arrayList into an array
        String[] myArray = new String[groceryList.getGroceryList().size()];                        //create the array to be equal to the size of the arraylist
        myArray = groceryList.getGroceryList().toArray(myArray);                                    //convert an arraylist of strings (the outcome of getGroceryList()), and save it into our array
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Not an option");
                    break;
            }
        }
    }

}
