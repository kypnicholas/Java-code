package com.kypnicholas;

public class Main {

    public static void main(String[] args) {
        /*int myNumber = 2;
        int finishNumber = 20;
        while (myNumber<=finishNumber){
            if (!isEvenNumber(myNumber)){
                myNumber++;
                continue;
            }
            System.out.println("Even number " + myNumber);
            myNumber++;
        }*/

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int myNumber = 2;
        int finishNumber = 20;
        int EvenNumberCount = 0;

        while(myNumber<=finishNumber){
           if (!isEvenNumber(myNumber)){
               myNumber++;
               continue;
           }
           else {
               System.out.println("Even number " + myNumber);
               myNumber++;
               EvenNumberCount++;

               if (EvenNumberCount==6){
                   System.out.println("Total number of even numbers found is " + EvenNumberCount);
                   break;
               }
           }
        }

    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int myNumber){
        if (myNumber%2==0){
            return true;
        }
        else {
            return false;
        }
    }

}
