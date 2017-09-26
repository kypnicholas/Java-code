package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        /* NON ENCAPSULATED PLAYER
        Player player = new Player();
        player.fullName = "Nick";
        player.health = 20;                                                               // we might forget to initialise a value
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200;                                                            //we can reset the health to whatever we want
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());
        */

        /* ENCAPSULATED PLAYER
        if the user sets health that is not >1 and <= 100 we ensure in the EncapsulatePlayer class that is it not accepted/ read.
        */
        EncapsulatedPlayer player = new EncapsulatedPlayer("Nick", 40, "Bow");
        System.out.println("Initial health is " + player.healthRemaining());


    }
}
