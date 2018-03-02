package com.company;

//import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class Pawn extends Piece {

    public boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;

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
        if (!color && numOfWhitePieces < 9){
            Pawn pawn = new Pawn(color);
            numOfWhitePieces ++;
            return pawn;

        }
        else if (color && numOfBlackPieces < 9){
            Pawn pawn = new Pawn(color);
            numOfBlackPieces ++;
            return pawn;
        }
        else throw new Error("created too many Pawns");
    }
}
