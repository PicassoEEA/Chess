package com.company;

//import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class Pawn extends Piece {
    private static int numOfPieces  = 0;
    public boolean color;// false for white and true for black
    private Pawn (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BP ";
        else
            return "WP ";
    }

    public static Pawn createPawn(boolean color){
        if (numOfPieces < 16){
            Pawn pawn1 = new Pawn(color);
            return pawn1;
        }
        else throw new Error("created too many Pawns");
    }
}
