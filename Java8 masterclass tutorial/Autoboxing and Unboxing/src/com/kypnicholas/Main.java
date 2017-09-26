package com.kypnicholas;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {

//CREATING AN ARRAY
        String[] strArray = new String[10];
        int[] intArray = new int[10];

//CREATING AN ARRAYLIST
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//WE CANNOT CREATE ARRAYLISTs WITH PRIMITIVE TYPES  LIKE --> ArrayList<int> intArrayList = new ArrayList<int>();
//The way around is to create a class wrapper and invoke that as an object, i.e. a class IntClass to store an integer into the first place of the arrayList
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);


//INSTEAD WE CAN USE AUTOBOXING (transform Primitive to the equivalent object type) AND UNBOXING (transform object to the equivalent primitive) TO DO THIS QUICKLY
//LONG WAY - EXAMPLE 1
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));                                   //AUTOBOXING - converting the primitive 'int' to an object 'Integer'
        }
        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());       //UNBOXING - convert back from the object wrapper 'Integer' to a primitive type 'int'
        }


//SHORT WAY to initialise the autoboxed values - EXAMPLE 1
        Integer myIntValue = 56;                        //Same as  --> Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue;                         //Same as  --> int myInt = myIntValue.intValue();


//SECOND EXAMPLE
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            //myDoubleValues.add(Double.valueOf(dbl));                    //AUTOBOXING - long way
            myDoubleValues.add(dbl);                                    //AUTOBOXING - short way    --> Converting from primitive double to object Double
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            //double value = myDoubleValues.get(i).doubleValue();         //UNBOXING - long way
            double value = myDoubleValues.get(i);                       //UNBOXING - short way  --> Converting back from object Double to primitive double
            System.out.println(i + "  --> " + value);
        }




    }
}
