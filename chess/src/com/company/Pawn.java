package com.company;

public class Pawn extends Piece {
    public boolean color;// false for white and true for black

    public Pawn (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BP ";
        }
        else {
            return "WP ";
        }

    }
}
