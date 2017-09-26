package com.kypnicholas;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nkypr on 08/08/2017.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);                  //Creating a new HashSet of the current contents of satellites
    }


    //OVERRIDING the equals() we are calling in the main() to check both for the class and the name of the object to make sure we have a correct comparison.
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {                                                   //First it compares the object to itself using the Object class equals()
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {         //Then compares the classes of the two objects
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();                    //Last it compares the names using String class equals()
        return this.name.equals(objName);
    }

    //We are adding an integer to avoid returning 0 as our hashcode, so whatever the value returned now, we will always add 57 to it.
    //We are adding 57 because is small enough not to cause an overflow of memory
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
}
