package com.kypnicholas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("\n");
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


    }

    public static int[] getIntegers(int number){
        int[] values =  new int[number];                            // passing our parameter 'number' into array slots
        System.out.println("Please enter " + number + " integer values. \r");

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static  void printArray(int[] values){
        for (int i=0; i<values.length; i++){
            System.out.println("Element " + i + " contains " + values[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        /*
        //creating a new array with the same length of the existing one, and copying the values in.
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        */

        //optimised way to do the code above using java libraries.
        //copy the 'array' of the specified length (copy as many as we need) into the 'sortedArray'
        int sortedArray[] = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for (int i=0; i<array.length-1; i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
