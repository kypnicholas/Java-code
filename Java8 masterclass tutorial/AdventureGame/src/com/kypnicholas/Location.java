package com.kypnicholas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nkypr on 07/08/2017.
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits!= null){                                      //We are checking if there are exits. If not we still pass an empty HashMap otherwise out system will crash on runtime.
            this.exits = new HashMap<String, Integer>(exits);   //one of the key points to make Location object immutable. Even if we delete an exit now in the main() when the object is created it will have the correct exits we are passing through the constructor
        }else{
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);                             //INSTEAD OF DEFINING SAME EXIT ('Q') FOR EVERY LOCATION IN OUR MAIN() WE CAN INITIALISE IT IN THE CONSTRUCTOR
    }


    public int getLocationID() {
        return locationID;
    }

    /* Not needed anymore because we are now passing the exits as a HashMap in the constructor
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }*/

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);    //Instead of just returning the exits map, we are creating a new hash map and passing the exits key and value. This will make sure that nothing outside this class can change the exits
    }
}
