package com.company;


public class Board {
    static Piece[][] pieces = new Piece[8][8];
    public Board()
    {
        //Black piece row
        pieces[0][0] = Piece.create("Rook",true);
        pieces[0][1] = Piece.create("Knight",true);
        pieces[0][2] = Piece.create("Bishop",true);
        pieces[0][3] = Piece.create("Queen",true);
        pieces[0][4] = Piece.create("King",true);
        pieces[0][5] = Piece.create("Bishop",true);
        pieces[0][6] = Piece.create("Knight",true);
        pieces[0][7] = Piece.create("Rook",true);

        //Black pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[1][i] = Piece.create("Pawn",true);

        //empty board
        /*for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < pieces.length ; j++)
                pieces[i+2][j] = new EmptyPiece();
        }*/

        //White pawn row
        for(int i = 0;i < pieces.length ; i++)
            pieces[6][i] = Piece.create("Pawn",false);
        //White piece row
        pieces[7][0] = Piece.create("Rook",false);
        pieces[7][1] = Piece.create("Knight",false);
        pieces[7][2] = Piece.create("Bishop",false);
        pieces[7][4] = Piece.create("Queen",false);
        pieces[7][3] = Piece.create("King",false);
        pieces[7][5] = Piece.create("Bishop",false);
        pieces[7][6] = Piece.create("Knight",false);
        pieces[7][7] = Piece.create("Rook",false);
    }



    public String toString(){
        String output = "";
        for (int i = 0 ; i < pieces.length ; i++){
            output += 8-i + "  ";
            for (int j = 0 ; j < pieces[0].length ; j++){
                if (pieces[i][j] == null)
                    output += "    ";
                else
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

    private String num2Alpha(int num) {
        if (num == 0) return "A";
        else if (num == 1) return "B";
        else if (num == 2) return "C";
        else if (num == 3) return "D";
        else if (num == 4) return "E";
        else if (num == 5) return "F";
        else if (num == 6) return "G";
        else return "H";}
    public static boolean move(int[] posFrom, int[] posTo)//Stevo created ,stevo and Luvin modified
    {

        Piece pieceFrom = pieces[posFrom[1]][posFrom[0]];
        if(pieceFrom.checkMove(posFrom,posTo) && clearPath(posFrom,posTo))
        {
            pieces[posFrom[1]][posFrom[0]] = null;
            pieces[posTo[1]][posTo[0]] = pieceFrom;
            return true;
        }
        return false;
    }
    public static Piece[] getView(int index[], boolean isBlack){
        int row = 0;
        if(isBlack)
            row = 1;
        else
            row = -1;
        Piece output[] = new Piece[3];
        if (index[0] != 0)
        output[2] = pieces[index[1] + row][index[0] - 1];
        output[1] = pieces[index[1] + row][index[0]];
        if (index[0] != 7)
        output[0] = pieces[index[1] + row][index[0] + 1];
        return output;
    }

    private static boolean clearPath(int[] posFrom, int[] posTo){//check if the path is clear ; by eric
        if (pieces[posFrom[1]][posFrom[0]] instanceof Knight)
            return true;
        int xDirection = 0;
        int yDirection = 0;
        int distance = 0;
        int[] currentPostion = new int[2];
        currentPostion[0] = posFrom[0];
        currentPostion[1] = posFrom[1];

        if (posFrom[0]> posTo[0])
            xDirection = -1;
        else if (posFrom[0] < posTo[0])
            xDirection = 1;
        if (posFrom[1] > posTo[1])
            yDirection = -1;
        else if (posFrom[1] < posTo[1])
            yDirection = 1;

        distance = Math.abs(posFrom[0] - posTo[0]);
        if (Math.abs(posFrom[1] - posTo[1]) > distance)
            distance = Math.abs(posFrom[1] - posTo[1]);

        for (int i = 0; i< distance - 1; i ++){
            currentPostion[1] = currentPostion[1] + yDirection;
            currentPostion[0] = currentPostion[0] + xDirection;
            if (pieces[currentPostion[1]][currentPostion[0]]  != null)
                return false;
        }
        return true;
    }
    public static Piece getPiece(int x,int y) {return(pieces[y][x]);} //steven created
}






















