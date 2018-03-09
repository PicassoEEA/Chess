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

    public void move(String startPosition, String endPosition){

    }

    private int[] Str2Index(String str){
        char char1 = str.substring(0,1).toCharArray()[0];
        char char2 = str.substring(1,2).toCharArray()[0];
        int index1 = 0;
        int index2 = 0;

        if (char1 >= 97){
            char1 -= 32;
        }


        index1 = ((int) char1) - 65;
        index2 = ((int) char2) - 48 - 1;

        int[] output = new int[2];
        output[0] = index1;
        output[1] = index2;

        return output;
    }
}
