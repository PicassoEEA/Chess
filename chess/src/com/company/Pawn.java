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
    public boolean checkMove(int[] startPos, int[] endPos){ //Luvin created Stevo modified
        Piece[] frontView = Board.getView(startPos,endPos,);
        if(frontView[1] != null)
            return false;
        else
            return true;
        if(frontView[0] == null||frontView[2] == null)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {

    }
}
