package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        GearBox Renault = new GearBox(6);

        /* **Only valid if the GEAR() Inner class is NOT private**
        GearBox.Gear first = Renault.new Gear(1, 12.3);
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);                  // Error. You need to create the Gear referencing the object of the outer class
        //Gearbox.Gear second = new Renault.Gear(2, 15.4);                  //Error. You need the .new function to create the object of the outer class
        System.out.println(first.driveSpeed(1000));
        */

        // Valid when the GEAR() Inner class is private. As we see we don't call it anywhere. Good practise of ENCAPSULATION
        Renault.operateClutch(true);
        Renault.changeGear(1);
        Renault.operateClutch(false);
        System.out.println(Renault.wheelSpeed(1000));
        Renault.changeGear(2);
        System.out.println(Renault.wheelSpeed(3000));
        Renault.operateClutch(true);
        Renault.changeGear(3);
        Renault.operateClutch(false);
        System.out.println(Renault.wheelSpeed(6000));


    }
}
