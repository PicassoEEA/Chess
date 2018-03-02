package com.company;

public class Rook extends Piece{
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
    public Rook (boolean color){
        this.color = color;
    }

    public String toString() {
        if (color) {
            return "BR ";
        } else {
            return "WR ";
        }
    }
        public  Rook createRook(boolean color){

            if (numOfPieces < 16){
                Rook Rook1 = new Rook(color);
                return Rook1;
            }
            else throw new Error("too many");

        }

}
