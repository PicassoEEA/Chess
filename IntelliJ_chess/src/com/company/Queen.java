package com.company;

public class Queen extends Piece{
    public boolean color;// false for white and true for black

public Queen (boolean color){
        this.color = color;
    }

    public String toString(){
        if (color) {
            return "BQ";
        }
        else {
            return "WQ";
        }

    }
}
