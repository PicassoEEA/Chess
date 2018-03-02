package com.company;


public class Board {
    Piece[][] pieces = new Piece[8][8];
    public Board()
    {
        //Black piece row
        pieces[0][0] = Rook.createRook(true);
        pieces[0][1] = Knight.createKnight(true);
        pieces[0][2] = Bishop.createBishop(true);
        pieces[0][3] = Queen.createQueen(true);
        pieces[0][4] = King.createKing(true);
        pieces[0][5] = Bishop.createBishop(true);
        pieces[0][6] = Knight.createKnight(true);
        pieces[0][7] = Rook.createRook(true);

        //Black pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[1][i] = Pawn.createPawn(true);
        //empty board
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < pieces.length ; j++)
                pieces[i+2][j] = new EmptyPiece();
        }
        //White pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[6][i] = Pawn.createPawn(false);
        //White piece rom
        pieces[7][0] = Rook.createRook(false);
        pieces[7][1] = Knight.createKnight(false);
        pieces[7][2] = Bishop.createBishop(false);
        pieces[7][4] = Queen.createQueen(false);
        pieces[7][3] = King.createKing(false);
        pieces[7][5] = Bishop.createBishop(false);
        pieces[7][6] = Knight.createKnight(false);
        pieces[7][7] = Rook.createRook(false);
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






















