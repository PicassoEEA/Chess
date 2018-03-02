package com.company;

public class King extends Piece {
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
    public King (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BKi";
        }
        else {
            return "WKi";
        }

    }
    public  King creatKing(boolean color){

        if (numOfPieces < 16){
            King King1 = new King(color);
            return King1;
        }
        else throw new Error("too many");

    }
}
