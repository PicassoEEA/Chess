package com.company;
import java.util.*;

public abstract class Piece {
    public abstract String toString();
    public static Piece createPiece(String pieceName, boolean color) //Stevo created
    {
        switch(pieceName)
        {
            case"Pawn":
            {
                if(Pawn.getPieceNum(false) <= 8)
                {
                    if(color) {
                        Pawn pawn = new Pawn(color);
                        Pawn.changePieceNum(color,true);
                        return pawn;
                    }
                    else {
                        Pawn pawn = new Pawn(color);
                        Pawn.changePieceNum(color,true);
                        return pawn;
                    }
                }
                else throw new Error("created too many Pawns. Pawns = "+String.valueOf(Pawn.getPieceNum(color)));
            }
            case"Knight":
            {
                if(Knight.getPieceNum(false) <= 2)
                {
                    if(color) {
                        Knight knight = new Knight(color);
                        Knight.changePieceNum(color,true);
                        return knight;
                    }
                    else {
                        Knight knight = new Knight(color);
                        Knight.changePieceNum(color,true);
                        return knight;
                    }
                }
                else throw new Error("created too many Knights. Knights = "+String.valueOf(Knight.getPieceNum(color)));
                //break;
            }
            case"Rook":
            {
                if(Rook.getPieceNum(false) <= 2)
                {
                    if(color) {
                        Rook rook = new Rook(color);
                        Rook.changePieceNum(color,true);
                        return rook;
                    }
                    else {
                        Knight knight = new Knight(color);
                        Rook.changePieceNum(color,true);
                        return knight;
                    }
                }
                else throw new Error("created too many Rooks. Rooks = "+String.valueOf(Rook.getPieceNum(color)));
                //break;
            }
            case"Bishop":
            {
                if(Bishop.getPieceNum(false) <= 2)
                {
                    if(color) {
                        Bishop bishop = new Bishop(color);
                        Bishop.changePieceNum(color,true);
                        return bishop;
                    }
                    else {
                        Bishop bishop = new Bishop(color);
                        Bishop.changePieceNum(color,true);
                        return bishop;
                    }
                }
                else throw new Error("created too many Bishops. Bishops = "+String.valueOf(Bishop.getPieceNum(color)));
                //break;
            }
            case"Queen":
            {
                if(Queen.getPieceNum(false) <= 2)
                {
                    if(color) {
                        Queen queen = new Queen(color);
                        Queen.changePieceNum(color,true);
                        return queen;
                    }
                    else {
                        Queen queen = new Queen(color);
                        Queen.changePieceNum(color,true);
                        return queen;
                    }
                }
                else throw new Error("created too many Queens. Queens = "+String.valueOf(Queen.getPieceNum(color)));
                //break;
            }
            case"King":
            {
                if(King.getPieceNum(false) <= 2)
                {
                    if(color) {
                        King king = new King(color);
                        King.changePieceNum(color,true);
                        return king;
                    }
                    else {
                        King king = new King(color);
                        King.changePieceNum(color,true);
                        return king;
                    }
                }
                else throw new Error("created too many Kings.Kings = "+String.valueOf(King.getPieceNum(color)));
                //break;
            }
        }
        throw new Error("illeagal identifier");
    }
}
