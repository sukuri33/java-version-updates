package com.learngenerics.customgenerics;

public class TestTeam {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer matt = new BaseballPlayer("Matt");
        PingpongPlayer chow = new PingpongPlayer("Chow");

        Team<FootballPlayer> redSkinFootballTeam = new Team<FootballPlayer>("Red Skin");
        redSkinFootballTeam.addPlayer(joe);
//        redSkinFootballTeam.addPlayer(matt);
//        redSkinFootballTeam.addPlayer(chow);




    }
}
