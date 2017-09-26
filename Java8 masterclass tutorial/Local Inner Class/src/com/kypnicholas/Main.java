package com.kypnicholas;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        /*
        //LOCAL CLASS that implements the OnClickListener() Interface and assign an instance to it
        //makes sense only if we are using this functionality in this class and we have buttons WITH THE EXACT SAME FUNCTIONALITY
        class ClickListener implements Button.OnClickListener{
            public ClickListener() {
                System.out.println("I ve been attached!");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
        */

        //ANONYMOUS INNER CLASSES are better if you have multiple buttons with DIFFERENT FUNCTIONALITY
        //Rather than defining a separate class for each button we can use an ANONYMOUS INNER CLASS to declare an object and assign it to a button in one expression
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }


    // To simulate the UI functionality because we dont have a button to click
    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
