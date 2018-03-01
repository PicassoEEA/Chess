package com.company;

public class King extends Piece {
    public boolean color;// false for white and true for black

    public King (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BKi";
        }
        else {
            return "WKi";
        }

    }
}
