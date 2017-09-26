package com.kypnicholas;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nkypr on 08/08/2017.
 */
public abstract class HeavenlyBody {                             //Removed FINAL so we can sub-class it
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //using an ENUM has the benefit of throwing an error at compile time if the bodyType argument we pass is not in the list specified
    //unlike defining the bodyType as an integer for example where we would only get an error during runtime if we are trying to pass a value not specified
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);                  //Creating a new HashSet of the current contents of satellites
    }

    //OVERRIDING the equals() we are calling in the main() to check both for the class and the name of the object to make sure we have a correct comparison.
    @Override
    public final boolean equals(Object obj) {                               //made FINAL to avoid problems with the equals() not being SYMMETRIC
        if(this == obj) {                                                   //First it compares the object to itself using the Object class equals()
            return true;
        }

        if(obj instanceof HeavenlyBody) {                                   //Confirms that our obj has the right class (i.e. the one of HeavenlyBody)
            HeavenlyBody theObject = (HeavenlyBody) obj;                    //Now that we know the obj is of the right class we create a new obj (use casting to get the right obj type)
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    //We are adding an integer to avoid returning 0 as our hashcode, so whatever the value returned now, we will always add 57 to it.
    //We are adding 57 because is small enough not to cause an overflow of memory
    @Override
    public final int hashCode() {                                            //made FINAL to avoid problems with the equals() not being SYMMETRIC
        return this.key.hashCode();
    }

    //We are passing name and bodyType (see previous program on Sets and HashSets) and we retrieve a key
    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    //Makes printing easier
    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }

    }
 }
