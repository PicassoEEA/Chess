package com.company;

public class Rook extends Piece{
    public boolean color;// false for white and true for black

    public Rook (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BR ";
        }
        else {
            return "WR ";
        }

    }
}
