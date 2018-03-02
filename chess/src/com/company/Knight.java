package com.company;

public class Knight extends Piece{
    public static boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;
    private Knight (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BKn";
        else
            return "WKn";
    }

    public static Knight createKnight (boolean color){
        if (!color && numOfWhitePieces < 2){
            Knight knight = new Knight(color);
            numOfWhitePieces ++;
            return knight;
        }
        else if (color && numOfBlackPieces < 2){
            Knight knight = new Knight(color);
            numOfBlackPieces ++;
            return knight;
        }
        else throw new Error("created too many Knights");
    }
}
