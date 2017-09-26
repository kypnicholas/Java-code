package com.kypnicholas;

/**
 * Created by nkypr on 09/08/2017.
 */
public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);           //For the BodyType we are passing the enum constant
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType()==BodyTypes.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }

    }
}
