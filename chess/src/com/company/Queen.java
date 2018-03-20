package com.company;

public class Queen extends Piece{
    public boolean isBlack;// false for white and true for black
    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;

    protected Queen (boolean isBlack){
        this.isBlack = isBlack;
    }

    public String toString(){
        if (isBlack)
            return "BQ ";
        else
            return "WQ ";
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
        double horizontalDistance = Math.sqrt((Math.abs(endPos[0] - startPos[0])));
        double verticalDistance = Math.sqrt((Math.abs(endPos[1] - startPos[1])));
        if (startPos[0] == endPos[0] || startPos[1] == endPos[1] || verticalDistance == horizontalDistance)
            return true;
        else
            return false;
    }
}

