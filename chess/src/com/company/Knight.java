package com.company;

public class Knight extends Piece{
    public static boolean color;// false for white and true for black
    public static int numOfPieces = 0;
    private Knight (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BKn";
        else
            return "WKn";

    }
    public static createKnight (boolean color){

        if (numOfPieces < 4){
            Knight knight1 = new Knight(color);
            return knight1;
        }
        else throw new Error("created too many Pawns");

    }
}
