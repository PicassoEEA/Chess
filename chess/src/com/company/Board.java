package com.company;


public class Board {
    Piece[][] board = new Piece[8][8];
    public Board()
    {
        //Black piece row
        board[0][0] = new Rook(true);
        board[0][1] = new Knight(true);
        board[0][2] = new Bishop(true);
        board[0][3] = new Queen(true);
        board[0][4] = new King(true);
        board[0][5] = new Bishop(true);
        board[0][6] = new Knight(true);
        board[0][7] = new Rook(true);

        //Black pawn row
        for(int i = 0;i < board.length ; i++)
            board[1][i] = new Pawn(true);
        //empty board
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < board.length ; j++)
                board[i+2][j] = new EmptyPiece();
        }
        //White pawn row
        for(int i = 0;i < board.length ; i++)
            board[6][i] = new Pawn(false);
        //White piece rom
        board[7][0] = new Rook(false);
        board[7][1] = new Knight(false);
        board[7][2] = new Bishop(false);
        board[7][4] = new Queen(false);
        board[7][3] = new King(false);
        board[7][5] = new Bishop(false);
        board[7][6] = new Knight(false);
        board[7][7] = new Rook(false);
    }



    public String toString(){
        String output = "";
        for (int i = 0 ; i < board.length ; i++){
            output += i + "";
            for (int j = 0 ; j < board[0].length ; j++){
                output += board[i][j];
            }
            output += "\n";
        }

        for (int i = 0 ; i < board.length ; i++)
            output += " " + num2Alpha(i);
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






















