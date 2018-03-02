package com.company;

public class Queen extends Piece{
    public boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;

    private Queen (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color)
            return "BQ ";
        else
            return "WQ ";
    }

    public static Queen createQueen(boolean color){
        if (!color && numOfWhitePieces < 9){
            Queen queen = new Queen(color);
            numOfWhitePieces ++;
            return queen;

        }
        else if (color && numOfBlackPieces < 9){
            Queen queen = new Queen(color);
            numOfBlackPieces ++;
            return queen;
        }
        else throw new Error("created too many Queens");
    }

}
