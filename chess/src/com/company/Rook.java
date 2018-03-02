package com.company;

public class Rook extends Piece{
    public boolean color;// false for white and true for black
    public static int numOfPieces = 0;
    private Rook (boolean color){
        this.color = color;
    }

    public String toString() {
        if (color)
            return "BR ";
        else
            return "WR ";
    }

        public static Rook createRook(boolean color){
            if (numOfPieces < 4){
                Rook Rook1 = new Rook(color);
                return Rook1;
            }
            else throw new Error("create too many Rooks");
        }
}
