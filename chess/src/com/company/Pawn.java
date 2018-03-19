package com.company;

public class Pawn extends Piece {

    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public boolean isBlack;// false for white and true for black
    static int step=0;
    protected Pawn (boolean isBlack){
        this.isBlack = isBlack;
    }

    public String toString(){
        if (isBlack)
            return "BP ";
        else
            return "WP ";
    }
    public static int getPieceNum(boolean isBlack)
    {
        if(isBlack)
            return numOfBlackPieces;
        else
            return numOfWhitePieces;
    }
    public static void changePieceNum(boolean isBlack, boolean isAdd)
    {
        if (isBlack) {
            if (isAdd)
                numOfBlackPieces += 1;
            else
                numOfBlackPieces -= 1;
        } else {
            if (isAdd)
                numOfWhitePieces += 1;
            else
                numOfWhitePieces -= 1;
        }
    }
    public boolean checkMove(int[] startPos, int[] endPos){


        if(endPos[0]-startPos[0]==1 ||endPos[1]-startPos[1]==1 ||startPos[0]-endPos[0]==1){
            step++;
            return true;
        }
        else if(endPos[1]-startPos[1]==2 &&step==0){
            step++;
            return true;

        }
        else if(Math.abs(startPos[0] - endPos[0]) ==1&& Math.abs(startPos[1] - endPos[1])==1 ){


        }
        else{
            return false;
    }
    }
}
