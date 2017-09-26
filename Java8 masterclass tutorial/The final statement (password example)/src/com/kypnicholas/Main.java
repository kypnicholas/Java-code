package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        System.out.println(Math.PI);                //PI is static!
//        Math m = new Math();                      //class Math() is static so we cannot create instances of it

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);


    }
}
