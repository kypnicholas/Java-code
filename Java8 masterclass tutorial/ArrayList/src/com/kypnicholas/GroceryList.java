package com.kypnicholas;

import java.util.ArrayList;

/**
 * Created by nkypr on 26/06/2017.
 */

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);          // Returns true if this list contains the specified element.

        int position = groceryList.indexOf(searchItem);             // RETURNS THE INDEX POSITION OF THE ITEM YOU HAVE SPECIFIED. Returns -1 if the item doesn't exist.
        if(position >=0) {
            return groceryList.get(position);
        }

        return null;
    }
}
