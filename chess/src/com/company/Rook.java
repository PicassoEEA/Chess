package com.company;

public class Rook extends Piece{
    public boolean color;// false for white and true for black
    private static int numOfWhitePieces = 0;
    private static int numOfBlackPieces = 0;
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
            if (!color && numOfWhitePieces < 9){
                Rook rook = new Rook(color);
                numOfWhitePieces ++;
                return rook;

            }
            else if (color && numOfBlackPieces < 9){
                Rook rook= new Rook(color);
                numOfBlackPieces ++;
                return rook;
            }
            else throw new Error("created too many Rooks");
        }
}
