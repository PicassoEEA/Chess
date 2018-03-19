package com.company;

public class Knight extends Piece{
    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public static boolean isBlack;// false for white and true for black

    protected Knight (boolean isBlack){
        this.isBlack = isBlack;
    }

    public String toString(){
        if (isBlack)
            return "BKn";
        else
            return "WKn";
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
    public boolean checkMove(int[] startPos, int[] endPos){ //created by jeremy
        if (Math.abs(endPos[0]) + Math.abs(endPos[1]) == 5 && Math.abs(endPos[0]) * Math.abs(endPos[1]) == 6)
            return true;
        else
            return false;
    }
}
