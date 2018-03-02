package com.company;

public class King extends Piece {
    public boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;
    private King (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BKi";
        else
            return "WKi";
    }

    public static King createKing(boolean color){
        if (!color && numOfWhitePieces < 1){
            King king = new King(color);
            numOfWhitePieces ++;
            return king;
        }
        else if (color && numOfBlackPieces < 1){
            King king = new King(color);
            numOfBlackPieces ++;
            return king;
        }
        else throw new Error("created too many Kings");
    }
}
