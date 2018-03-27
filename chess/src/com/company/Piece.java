package com.company;

public abstract class Piece {
    public abstract String toString();
    public abstract boolean checkIsBlack();
    public abstract boolean checkMove(int[] startPos, int[] endPos);// Steevo created, Mar14 10:21 Stevo modified
    public static Piece create(String pieceName, boolean isBlack) //Stevo created, improved on Mar.27
    {
        switch(pieceName)
        {
            case"Pawn":
            {
                if(Pawn.getPieceNum(isBlack) <= 8)
                {
                    Pawn pawn = new Pawn(isBlack);
                    if(isBlack)
                        Pawn.numOfBlackPieces++;
                    else
                        Pawn.numOfWhitePieces++;
                    return pawn;
                }
                else 
                {
                    throw new Error("created too many Pawns.");
                }
            }
            case"Knight":
            {
                if(Knight.getPieceNum(isBlack) <= 2)
                {
                    Knight knight = new Knight(isBlack);
                    if(isBlack)
                        Knight.numOfBlackPieces++;
                    else
                        Knight.numOfWhitePieces++;
                    return knight;
                }
                else
                {
                    throw new Error("created too many Knights.");
                }
            }
            case"Rook":
            {
                if(Rook.getPieceNum(isBlack) <= 2)
                {
                    Rook rook = new Rook(isBlack);
                    if(isBlack)
                        Rook.numOfBlackPieces++;
                    else
                        Rook.numOfWhitePieces++;
                    return rook;
                }
                else
                {
                    throw new Error("created too many Rooks.");
                }
            }
            case"Bishop":
            {
                if(Bishop.getPieceNum(isBlack) <= 2)
                {
                    Bishop bishop = new Bishop(isBlack);
                    if(isBlack)
                        Bishop.numOfBlackPieces++;
                    else
                        Bishop.numOfWhitePieces++;
                    return bishop;
                }
                else
                {
                    throw new Error("created too many Bishops.");
                }
            }
            case"Queen":
            {
                if(Queen.getPieceNum(isBlack) <= 1)
                {
                    Queen queen = new Queen(isBlack);
                    if(isBlack)
                        Queen.numOfBlackPieces++;
                    else
                        Queen.numOfWhitePieces++;
                    return queen;
                }
                else
                {
                    throw new Error("created too many Queens.");
                }
            }
            case"King":
            {
                if(King.getPieceNum(isBlack) <= 1)
                {
                    King king = new King(isBlack);
                    if(isBlack)
                        King.numOfBlackPieces++;
                    else
                        King.numOfWhitePieces++;
                    return king;
                }
                else
                {
                    throw new Error("created too many Kings.");
                }
            }
        }
        throw new Error("illeagal identifier");
    }
}
