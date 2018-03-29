package com.company;

public class King extends Piece {
    private boolean isBlack;// false for white and true for black
    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    public boolean moveOrNot=true;
    protected King (boolean isBlack){
        this.isBlack = isBlack;
    }

    public String toString(){
        if (isBlack)
            return "BKi";
        else
            return "WKi";
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
    public boolean checkMove(int[] startPos, int[] endPos){ //created by jeremy modified by stevo3.16
        if (Math.abs(startPos[0] - endPos[0]) <= 1 && Math.abs(startPos[1] - endPos[1]) <= 1){
            moveOrNot=false;
            return true;
        }
        else
            return false;

    }
    public boolean checkIsBlack(){
        return isBlack;
    }
}
