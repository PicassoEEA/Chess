package com.company;

public class Queen extends Piece{
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
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
        if (numOfPieces < 2){
            Queen Queen1 = new Queen(color);
            return Queen1;
        }
        else throw new Error("created too many Queens");
    }

}
