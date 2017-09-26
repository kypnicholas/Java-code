package com.kypnicholas;

/**
 * Created by nkypr on 09/08/2017.
 */
public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
