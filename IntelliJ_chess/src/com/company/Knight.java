package com.company;

public class Knight extends Piece{
    public boolean color;// false for white and true for black

    public Knight (boolean color){
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
