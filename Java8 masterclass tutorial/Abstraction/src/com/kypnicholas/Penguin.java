package com.kypnicholas;

/**
 * Created by nkypr on 15/07/2017.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    // still makes sense to overwrite it (unlike in Parrot class) because penguins have different flying behaviour than other birds
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
