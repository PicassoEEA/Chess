package com.company;

public class Bishop extends Piece {
    public boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;

    private Bishop (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BB ";
        else
            return "WB ";
    }

    public static Bishop createBishop(boolean color){
        if (!color && numOfWhitePieces < 2){
            Bishop bishop = new Bishop(color);
            numOfWhitePieces ++;
            return bishop;
        }
        else if (color && numOfBlackPieces < 2){
            Bishop bishop = new Bishop(color);
            numOfBlackPieces ++;
            return bishop;
        }
        else throw new Error("created too many Bishops");
    }
}
