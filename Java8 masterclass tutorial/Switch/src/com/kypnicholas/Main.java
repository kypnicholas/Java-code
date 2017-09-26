package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        char switchChar = 'F';
        switch (switchChar){
            case 'A':
                System.out.println("Value was " + switchChar);
                break;
            case 'B':
                System.out.println("Value was " + switchChar);
                break;
            case 'C': case 'D' : case 'E':
                System.out.println("Value was one of C or D or E: " + switchChar);
                break;
            default:
                System.out.println("Value was not A or B or C or D or E");
                break;

        }

        String month = "JuNE";
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


    }
}
