package com.company;

public class Bishop extends Piece {
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
    public Bishop (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BB ";
        }
        else {
            return "WB ";
        }

    }
    public  Bishop creatBishop(boolean color){

        if (numOfPieces < 16){
            Bishop Bishop1 = new Bishop(color);
            return Bishop1;
        }
        else throw new Error("too many");

    }
}
