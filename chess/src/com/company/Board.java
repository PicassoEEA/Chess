package com.company;


public class Board {
    Piece[][] pieces = new Piece[8][8];
    public Board()
    {
        //Black piece row
        pieces[0][0] = new Rook(true);
        pieces[0][1] = new Knight(true);
        pieces[0][2] = new Bishop(true);
        pieces[0][3] = new Queen(true);
        pieces[0][4] = new King(true);
        pieces[0][5] = new Bishop(true);
        pieces[0][6] = new Knight(true);
        pieces[0][7] = new Rook(true);

        //Black pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[1][i] = new Pawn(true);
        //empty board
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < pieces.length ; j++)
                pieces[i+2][j] = new EmptyPiece();
        }
        //White pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[6][i] = new Pawn(false);
        //White piece rom
        pieces[7][0] = new Rook(false);
        pieces[7][1] = new Knight(false);
        pieces[7][2] = new Bishop(false);
        pieces[7][4] = new Queen(false);
        pieces[7][3] = new King(false);
        pieces[7][5] = new Bishop(false);
        pieces[7][6] = new Knight(false);
        pieces[7][7] = new Rook(false);
    }



    public String toString(){
        String output = "";
        for (int i = 0 ; i < pieces.length ; i++){
            output += i + "  ";
            for (int j = 0 ; j < pieces[0].length ; j++){
                output += pieces[i][j] + " ";
            }
            output += "\n";
        }

        output += "\n ";

        for (int i = 0 ; i < pieces.length ; i++)
            output += "  " + num2Alpha(i) + " ";
        return output;
    }

    public void main(){
        System.out.println(toString());
    }

    private String num2Alpha(int num){
        if (num == 0) return "A";
        else if (num == 1) return "B";
        else if (num == 2) return "C";
        else if (num == 3) return "D";
        else if (num == 4) return "E";
        else if (num == 5) return "F";
        else if (num == 6) return "G";
        else return "H";

    }

}






















