package com.company;

public class Knight extends Piece{
    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public static boolean color;// false for white and true for black

    protected Knight (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
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
}
