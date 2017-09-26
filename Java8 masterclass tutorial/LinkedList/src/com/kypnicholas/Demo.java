package com.kypnicholas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by nkypr on 09/07/2017.
 */
public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

       /* placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);
        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);*/

        addInAlphabeticalOrder(placesToVisit, "Sydney");
        addInAlphabeticalOrder(placesToVisit, "Melbourne");
        addInAlphabeticalOrder(placesToVisit, "Brisbane");
        addInAlphabeticalOrder(placesToVisit, "Perth");
        addInAlphabeticalOrder(placesToVisit, "Canberra");
        addInAlphabeticalOrder(placesToVisit, "Adelaide");
        addInAlphabeticalOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInAlphabeticalOrder(placesToVisit, "Alice Springs");
        addInAlphabeticalOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();                           //Iterator
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInAlphabeticalOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();        //list iterator *more flexible than normal iterator*

        while(stringListIterator.hasNext()){
            int comparison=stringListIterator.next().compareTo(newCity);   // compareTo() RETURNS 0 IF STRINGS ARE EQUAL, NEGATIVE IF ARGUMENT STRING IS BEFORE AND POSITIVE IF AFTER (ALPHABETICAL COMPARISON)
            if(comparison == 0) {                                                    // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if (comparison > 0) {                             //new City should appear before this one i.e. if we were adding Adelaide, should come up before Brisbane
                stringListIterator.previous();                      //need to go back one entry as we have already used .next() earlier and moved to the next entry
                stringListIterator.add(newCity);                    //.previous() took us back to the entry before Brisbane, where we are going to add Adelaide
                return true;
            }else if(comparison < 0) {                               // move on next city

            }
        }
        stringListIterator.add(newCity);
        return  true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    /*
                    DUE TO THE LINKEDLISTS LIMITATION/REPETITION ISSUE THIS PART OF THE CODE CHECKS AND IF THE USER IS MOVING FORWARDS AND IF HE SELECTS TO GO FORWARD (menu option to go to next)
                    the code will direct him to the right direction
                    */
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    /*
                    SIMILARLY IF THE USER IS MOVING FORWARDS AND HE SELECTS TO GO BACKWARDS(menu option to go to previous)
                    the code will direct him to the right direction
                    */
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }




}
