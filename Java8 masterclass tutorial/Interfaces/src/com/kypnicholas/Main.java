package com.kypnicholas;

public class Main {

    public static void main(String[] args) {
        ITelephone nicksPhone;
        //DeskPhone nicksPhone;                             //if this was not commented out it would invalidate the call to create MobilePhone
        nicksPhone = new DeskPhone(123456);
        nicksPhone.powerOn();
        nicksPhone.callPhone(123456);
        nicksPhone.answer();

        nicksPhone = new MobilePhone(123456);
        nicksPhone.powerOn();
        nicksPhone.callPhone(123456);
        nicksPhone.answer();

    }
}
