package com.kypnicholas;

/**
 * Created by nkypr on 08/08/2017.
 */
public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {           //We made it final to make sure it cannot be overwritten (i.e. in Labrador())
        if(this == obj) {
            return true;
        }

        if(obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
