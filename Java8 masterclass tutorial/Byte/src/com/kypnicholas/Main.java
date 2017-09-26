package com.kypnicholas;
public class Main {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myAddition = (long) 10 * (myByte + myShort + myInt);
        long myLong = 50000 + myAddition;
        long myLong2 = 25000L;

        System.out.println(myLong);
        System.out.println(myLong2);

        //width of 32 (4 bytes)
        int myIntValue = 5/2;
        //width of 32 (4 bytes)
        float myFloat = 5f/3f;
        //width of 64 (8 bytes)
        double myDouble = 5f/3f;

        System.out.println("myIntValue: " + myIntValue);            //typing 'sout' + 'Tab' will auto insert the statement for you!
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);

        boolean isCar = false;
        boolean wasCar = isCar ? true:false;        // if isCar is true then wasCar equals to true, otherwise wasCar equals to false
        System.out.println(wasCar);

    }
}
