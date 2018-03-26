package com.company;

public class Knight extends Piece{
    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public boolean isBlack;// false for white and true for black

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
        int horizontalDistance = Math.abs(startPos[0] - endPos[0]) + 1;
        int verticalDistance = Math.abs(startPos[1] - endPos[1]) + 1;
        if (horizontalDistance + verticalDistance == 5 && horizontalDistance * verticalDistance == 6)
            return true;
        else
            return false;
    }
}
