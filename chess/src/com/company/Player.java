package com.company;

public class Player {
    private String name = null;
    private static int numOfPlayers = 0;



    private Player(String name){
        this.name = name;
    }
    public Player createPlayer(String name){
        if (numOfPlayers <= 2){
            Player player = new Player(name);
            numOfPlayers ++;
            return player;
        }
        else
            throw new Error ("too many players");
    }

    public String getName(){
        return name;
    }

    private int[][] Str2Index(){}
}
