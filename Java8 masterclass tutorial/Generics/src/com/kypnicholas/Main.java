package com.kypnicholas;

import java.util.ArrayList;

public class Main {

    //ORIGINAL WAY WE LEARNED TO BUILD ARRAYLISTS.
    /*
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("tim");                                 //this will compile but will throw an error on runtime
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);            //CAST as an integer
        }
    }
    */

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
