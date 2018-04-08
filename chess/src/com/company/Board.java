package com.company;

import java.util.Arrays;

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
        pieces[7][3] = Piece.create("Queen",false);
        pieces[7][4] = Piece.create("King",false);
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
        if(pieceFrom.checkMove(posFrom,posTo) && clearPath(posFrom,posTo) && !ifMate(pieceFrom.checkIsBlack()))
        {
            if(pieceFrom instanceof King)
            {
                if(pieceFrom.checkIsBlack() && posTo[0] - posFrom[0] == 2)
                {
                    Piece pieceRight1=pieces[posFrom[1]][posFrom[0]+1];
                    Piece pieceRight2=pieces[posFrom[1]][posFrom[0]+2];
                    if(pieceRight1==null && pieceRight2==null)
                    {
                        pieces[posFrom[1]][posFrom[0]] = null;
                        pieces[posTo[1]][posTo[0]] = pieceFrom;
                        pieces[0][5]=pieces[0][7];
                        pieces[0][7]=null;
                        King kingPiece = (King)pieceFrom;
                        kingPiece.setMoved();
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(posTo[0] - posFrom[0] == 2) {
                    Piece pieceRight1 = pieces[posFrom[1]][posFrom[0] + 1];
                    Piece pieceRight2 = pieces[posFrom[1]][posFrom[0] + 2];
                    if (pieceRight1 == null && pieceRight2 == null) {
                        pieces[posFrom[1]][posFrom[0]] = null;
                        pieces[posTo[1]][posTo[0]] = pieceFrom;
                        pieces[7][5] = pieces[7][7];
                        pieces[7][7] = null;
                        King kingPiece = (King) pieceFrom;
                        kingPiece.setMoved();
                        return true;
                    } else {
                        return false;
                    }
                }
                else
                {
                    pieces[posFrom[1]][posFrom[0]] = null;
                    pieces[posTo[1]][posTo[0]] = pieceFrom;
                    King kingPiece = (King) pieceFrom;
                    kingPiece.setMoved();
                    return true;
                }
            }
            else{
            pieces[posFrom[1]][posFrom[0]] = null;
            pieces[posTo[1]][posTo[0]] = pieceFrom;
            return true;
            }
        }
        return false;
    }

    public static Piece[] getView(int index[], boolean isBlack){//modified by eric(wrong row and column)
        int row = 0;
        if(isBlack)
            row = 1;
        else
            row = -1;
        Piece output[] = new Piece[3];
        if (index[0]!=0){
            output[0] = pieces[index[1]+row][index[0]-1];
        }
        output[1] = pieces[index[1]+row][index[0]];
        if (index[0]!=7) {
            output[2] = pieces[index[1]+row][index[0]+1];
        }

        /*
        if (index[0] != 0) {
            output[2] = pieces[index[0] + row][index[1] - 1];
            output[1] = pieces[index[0] + row][index[1]];
        }
        if (index[1] != 7)
            output[0] = pieces[index[0] + row][index[1] + 1];
            */
        return output;
    }

    // created at 20180407 by Eric
    // make sure that col and row is valid number
    private static boolean posValid(int col, int row)
    {
        if ((col<0)||(col>7)){
            return false;
        }

        if ((row<0)||(row>7)){
            return false;
        }

        return true;
    }

    // modified at 20180407 by Eric
    // 1. add pieces!=null
    // 2. add posValid function
    private static boolean clearPath(int[] posFrom, int[] posTo){//check if the path is clear ; by eric
        if (pieces[posFrom[1]][posFrom[0]]!=null && pieces[posFrom[1]][posFrom[0]] instanceof Knight)
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
            if (posValid(currentPostion[1], currentPostion[0])
                    && pieces[currentPostion[1]][currentPostion[0]]  != null)
                return false;
        }
        return true;
    }

    public static Piece getPiece(int x,int y) {return(pieces[y][x]);} //steven created

    // modified at 20180407 by Eric
    // 1. change the return value to true for checkmate
    // 2. add clearPath function when checkMove
    // 3. modify postion expression, ex. start={a, b} to {b, a}
    private static boolean ifMate(boolean isBlack){//by Jeremy; modified by eric (wrong loop)
        int a = 0;
        int b = 0;
        while(a < 8){
            b = 0;
            while(b < 8) {
                int[] start = {b, a};
                if (pieces[a][b] != null && pieces[a][b].checkIsBlack() != isBlack) {
                    int c = 0;
                    int d = 0;
                    while (c < 8) {
                        d = 0;
                        while(d < 8) {
                            int[] end = {d, c};
                            if (clearPath(start,end) && pieces[a][b].checkMove(start, end)) {
                                if (checkKingPosition(isBlack, end)){
                                    return true;
                                }
                            }
                            d++;
                        }
                        c++;
                    }
                }
                b++;
            }
            a++;
        }
        return false;
    }


    // check if position is the King position
    private static boolean checkKingPosition(boolean isBlack, int[] position) {
        int a = position[1];
        int b = position[0];
        if (pieces[a][b]!=null && pieces[a][b] instanceof King && pieces[a][b].checkIsBlack() == isBlack) {
            return true;
        }

        return false;

    }

    /*public static boolean endgame(boolean isBlack){//by eric; true for keep playing and false for end game
        int[] startPos = new int[2];
        int[] endPos = new int[2];
        Piece temp = null;
        if (ifMate(isBlack)) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {


                    if ((pieces[i][j]!=null)&&(pieces[i][j].checkIsBlack()==isBlack)){
                        for (int k = 0 ; k < 8 ; k++){
                            for (int l = 0 ; l < 8 ; l++){
                                startPos[0] = j;
                                startPos[1] = i;
                                endPos[0] = l;
                                endPos[1] = k;
                                if(move(startPos,endPos)){
                                    if (ifMate(isBlack)) {
                                        temp = pieces[i][j];
                                        pieces[i][j] = pieces[k][l];
                                        pieces[k][l] = temp;
                                        return false;
                                    }
                                    temp = pieces[i][j];
                                    pieces[i][j] = pieces[k][l];
                                    pieces[k][l] = temp;
                                }

                            }
                        }
                    }
                }
            }

            return false;
        }
        return true;
    }*/

    /*public static boolean endGame(boolean isBlack){//true for endgame and false for comtinues
        Piece[][] tempPieces = new Piece[8][8];
        for (int i = 0 ; i < 8 ; i++){//copy a board
            for (int j = 0 ; j < 8 ; j++)
                tempPieces[i][j] = pieces[i][j];
        }
        if (ifMate(isBlack)){
            for (int i = 0 ; i < 8 ; i++){//copy a board
                for (int j = 0 ; j < 8 ; j++)
                    if (pieces[i][j] != null && pieces[i][j].checkIsBlack() == isBlack){
                    int [] startPos = {j,i};
                        for (int k = 0 ; k < 8 ; k++){
                            for (int l = 0 ; l < 8 ; l++){
                                int [] endPos = {l,k};
                                if (clearPath(startPos,endPos) && pieces[i][j].checkMove(startPos, endPos)){
                                    move(startPos,endPos);
                                    if(!ifMate(isBlack)){
                                        pieces = tempPieces;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
            }
            pieces = tempPieces;
            return true;
        }



        return false;
    }*/

    public static boolean endGame(boolean isBlack){//true for end game and false for continue
        //boolean output = false;
        for (int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                if (pieces[i][j] instanceof King && pieces[i][j].checkIsBlack() == isBlack)
                    return false;
            }
        }
        return true;
    }



}






















