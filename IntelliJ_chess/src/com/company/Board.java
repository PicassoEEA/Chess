package com.company;
import java.util.*;

public class Board {
    ArrayList[][] board = new ArrayList[8][8];
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
        //Black pawn row
        for(int i = 0;i<7;i++)
            board[1][i] = new Pawn(true);
        //White pawn row
        for(int i = 0;i<7;i++)
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
}






















}