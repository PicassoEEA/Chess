package com.company;

public class Pawn extends Piece {

    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public boolean isBlack;// false for white and true for black

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
}
