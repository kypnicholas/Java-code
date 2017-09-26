package com.kypnicholas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nkypr on 21/07/2017.
 */
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league= new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            return false;
        }else{
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);               //Sorts the specified list into ascending order
        for(T t : league) {                     //for every t(team) that is in the league ArrayList, print the following
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
