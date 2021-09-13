package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        FootballPlayer roy = new FootballPlayer("Roy");
        BaseballPlayer rick =  new BaseballPlayer("Rick");
        SoccerPlayer georgios = new SoccerPlayer("Georgios");

        Team<FootballPlayer> loutrakiSleepers = new Team<>("Loutraki Sleepers");
        loutrakiSleepers.addPlayer(roy);

        Team<BaseballPlayer> corinthians = new Team<>("Corinthians");
        corinthians.addPlayer(rick);

        Team<SoccerPlayer> panathinaikos = new Team<>("Panathinaikos");
        panathinaikos.addPlayer(georgios);

        Team<FootballPlayer> pissiaWolfs = new Team<>("Pissia Wolfs");
        Team<FootballPlayer> perachoraBarbarians = new Team<>("Perachora Barbarians");

        pissiaWolfs.matchResult(loutrakiSleepers, 0, 3);
        pissiaWolfs.matchResult(perachoraBarbarians, 2, 0);

        loutrakiSleepers.matchResult(perachoraBarbarians, 4, 1);
        loutrakiSleepers.matchResult(pissiaWolfs, 7, 3);

        System.out.println("Rankings: ");
        System.out.println(loutrakiSleepers.getName() + " : " + loutrakiSleepers.ranking());
        System.out.println(perachoraBarbarians.getName() + " : " + perachoraBarbarians.ranking());
        System.out.println(pissiaWolfs.getName() + " : " + pissiaWolfs.ranking());

        System.out.println(loutrakiSleepers.compareTo(pissiaWolfs));
        System.out.println(loutrakiSleepers.compareTo(perachoraBarbarians));
        System.out.println(pissiaWolfs.compareTo(loutrakiSleepers));
        System.out.println(perachoraBarbarians.compareTo(loutrakiSleepers));

        League<Team<FootballPlayer>> footballLeague = new League<>("Premier League");
        footballLeague.addTeam(pissiaWolfs);
        footballLeague.addTeam(loutrakiSleepers);
        footballLeague.addTeam(perachoraBarbarians);
        footballLeague.addTeam(pissiaWolfs);
        footballLeague.printStandings();

    }

}
