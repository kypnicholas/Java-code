package com.kypnicholas;

/**
 * Created by nkypr on 24/06/2017.
 */
public class VW extends Car {

    private int roadServiceMonths;

    public VW(int roadServiceMonths) {
        super("Volkswagen", "1", 4, 4, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {                          // Rate is the difference in speed from the current speed

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity ==0) {
            stop();
            changeGear(1);
        } else if(newVelocity >0 && newVelocity <=10) {
            changeGear(1);
        } else if(newVelocity >10 && newVelocity <=20) {
            changeGear(2);
        } else if(newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }


    }

}
