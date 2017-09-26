package com.kypnicholas;

import java.util.ArrayList;

/**
 * Created by nkypr on 20/07/2017.
 */

//<T> indicates that is expecting a Type parameter. Means it will be able to take any type of player (baseball, football etc)
//<T extends Player> is a bounded type parameter. Means it can be of the same type as Player or classes extending from Player (i.e. FootballPlayer, SoccerPlayer etc)
// implements Comparable<TeamGenericClass<T>> is used to provide access to compareTo method which takes as an argument a Team<T>
public class TeamGenericClass<T extends Player> implements Comparable<TeamGenericClass<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public TeamGenericClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(TeamGenericClass<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(TeamGenericClass<T> team) {
        // Takes an object as argument and returns negative if it is less than the object we compare it too
        // i.e. adelaideCrows.compareTo(melbourne)
        // if you check the main() it returns -1 because  melbourne has less points than adelaideCrows
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}

