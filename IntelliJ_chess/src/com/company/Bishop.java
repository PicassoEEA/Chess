package com.company;

public class Bishop extends Piece {
    public boolean color;// false for white and true for black

    public Bishop (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BKn";
        }
        else {
            return "WKn";
        }

    }
}
