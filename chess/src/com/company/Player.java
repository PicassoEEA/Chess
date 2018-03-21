package com.company;

public class Player {
    private String name = null;
    private static int numOfPlayers = 0;
    public int colorOfPlayer=0;
    public boolean isBlack;

    private Player(String name){
        this.name = name;
    }
    public static Player createPlayer(String name){
        if (numOfPlayers <= 2){
            Player player = new Player(name);
            numOfPlayers ++;
            player.colorOfPlayer=numOfPlayers-1;
            return player;
        }
        else
            throw new Error ("too many players");
    }

    public String getName(){ // by eric
        return name;
    }

    public boolean move(String startPosition, String endPosition){ //by eric & luvin
        if(startPosition.equals(endPosition))
            return false;
        else{

            /*if(selfOrNot(Board.pieces[str2Index(startPosition)[0]][str2Index(startPosition)[1]]))
            {
                Board.move(str2Index(startPosition),str2Index(endPosition));
                return true;
            }
            else {*/
                return false;
            }
        }

    //}
    /*private boolean selfOrNot(Piece p1)
    {
        if(p1.returnTheColor()==isBlack)
        {
            return true;
        }
        else if(!p1.returnTheColor()==isBlack){
            return false;

        }
    }*/
    private int[] str2Index(String str){ //by eric
        char char1 = str.substring(0,1).toCharArray()[0];
        char char2 = str.substring(1,2).toCharArray()[0];
        int index1 = 0;
        int index2 = 0;

        if (char1 >= 97){
            char1 -= 32;
        }


        index1 = ((int) char1) - 65;
        index2 = ((int) char2) - 48 - 1;

        index2 = 7 - index2;

        int[] output = new int[2];
        output[0] = index1;
        output[1] = index2;

        return output;
    }

    public String toString(){ //by eric
        return name;
    }
}
