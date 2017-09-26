package com.kypnicholas;

public class Main {

    public static void main(String[] args) {


        /*
        //for use with the non-generic class Team()
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
        */


        //for use with the GENERIC class TeamGenericClass()
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        TeamGenericClass<FootballPlayer> adelaideCrows = new TeamGenericClass<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);             // pat and beckham are throwing error on compile because we defined the type expected as Football player and they are defined as something else
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        TeamGenericClass<BaseballPlayer> baseballTeam = new TeamGenericClass<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        TeamGenericClass<SoccerPlayer> brokenTeam = new TeamGenericClass<>("this won't work");
        brokenTeam.addPlayer(beckham);

        TeamGenericClass<FootballPlayer> melbourne = new TeamGenericClass<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        TeamGenericClass<FootballPlayer> hawthorn= new TeamGenericClass<>("Hawthorn");
        TeamGenericClass<FootballPlayer> fremantle= new TeamGenericClass<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //adelaideCrows.matchResult(baseballTeam, 1, 1);       //GETTING AN ERROR BECAUSE AdelaideCrows is a football team and has different type than baseballTeam

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking() + " points");
        System.out.println(melbourne.getName() + ": " + melbourne.ranking() + " points");
        System.out.println(fremantle.getName() + ": " + fremantle.ranking() + " points");
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking() + " points");

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}
