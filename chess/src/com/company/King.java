package com.company;

public class King extends Piece {
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
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
        if (numOfPieces < 2){
            King King1 = new King(color);
            return King1;
        }
        else throw new Error("created too many Kings");
    }
}
