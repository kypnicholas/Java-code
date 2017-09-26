package com.kypnicholas;

public class Main {

    public static void main(String[] args) {
        //Since dimensions is treated as separate object we need to initialise it
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        //If you do not want yo create a variable and use it elsewhere and only want to pass it to a method you can initialise it as below
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPC = new PC(theCase, theMonitor, theMotherboard);
        /*
        myPC.getTheMonitor().drawPixelAt(200,150,"red");
        myPC.getTheMotherboard().loadProgram("MS Word");
        myPC.getTheCase().pressPowerButton();
        */

        myPC.powerUp();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(3, 2);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);


        Bedroom nicksbedroom = new Bedroom("Nick's Bedroom", wall1, wall2, wall3, wall4, ceiling,bed, lamp);

        // Three ways of accessing the same function using Composition
        bed.make();                                         // calls the Bed class make() straight up.
        nicksbedroom.makeBed();                             // calls the Bedroom class makeBed() straight up.
        nicksbedroom.getBed().make();                       // using the Getter in Bedroom class to call the make() in the Bed class
    }
}
