package com.company;

public abstract class Piece {
    public abstract String toString();
    public abstract boolean checkMove(int[] startPos, int[] endPos);// Steevo created, Mar14 10:21 Stevo modified
    public boolean isBlack;
    public static Piece create(String pieceName, boolean isBlack) //Stevo created
    {
        switch(pieceName)
        {
            case"Pawn":
            {
                if(Pawn.getPieceNum(false) <= 8)
                {
                    if(isBlack) {
                        Pawn pawn = new Pawn(isBlack);
                        Pawn.changePieceNum(isBlack,true);
                        return pawn;
                    }
                    else {
                        Pawn pawn = new Pawn(isBlack);
                        Pawn.changePieceNum(isBlack,true);
                        return pawn;
                    }
                }
                else throw new Error("created too many Pawns. Pawns = "+String.valueOf(Pawn.getPieceNum(isBlack)));
            }
            case"Knight":
            {
                if(Knight.getPieceNum(false) <= 2)
                {
                    if(isBlack) {
                        Knight knight = new Knight(isBlack);
                        Knight.changePieceNum(isBlack,true);
                        return knight;
                    }
                    else {
                        Knight knight = new Knight(isBlack);
                        Knight.changePieceNum(isBlack,true);
                        return knight;
                    }
                }
                else throw new Error("created too many Knights. Knights = "+String.valueOf(Knight.getPieceNum(isBlack)));
                //break;
            }
            case"Rook":
            {
                if(Rook.getPieceNum(false) <= 2)
                {
                    if(isBlack) {
                        Rook rook = new Rook(isBlack);
                        Rook.changePieceNum(isBlack,true);
                        return rook;
                    }
                    else {
                        Rook rook = new Rook(isBlack);
                        Rook.changePieceNum(isBlack,true);
                        return rook;
                    }
                }
                else throw new Error("created too many Rooks. Rooks = "+String.valueOf(Rook.getPieceNum(isBlack)));
                //break;
            }
            case"Bishop":
            {
                if(Bishop.getPieceNum(false) <= 2)
                {
                    if(isBlack) {
                        Bishop bishop = new Bishop(isBlack);
                        Bishop.changePieceNum(isBlack,true);
                        return bishop;
                    }
                    else {
                        Bishop bishop = new Bishop(isBlack);
                        Bishop.changePieceNum(isBlack,true);
                        return bishop;
                    }
                }
                else throw new Error("created too many Bishops. Bishops = "+String.valueOf(Bishop.getPieceNum(isBlack)));
                //break;
            }
            case"Queen":
            {
                if(Queen.getPieceNum(false) <= 2)
                {
                    if(isBlack) {
                        Queen queen = new Queen(isBlack);
                        Queen.changePieceNum(isBlack,true);
                        return queen;
                    }
                    else {
                        Queen queen = new Queen(isBlack);
                        Queen.changePieceNum(isBlack,true);
                        return queen;
                    }
                }
                else throw new Error("created too many Queens. Queens = "+String.valueOf(Queen.getPieceNum(isBlack)));
                //break;
            }
            case"King":
            {
                if(King.getPieceNum(false) <= 2)
                {
                    if(isBlack) {
                        King king = new King(isBlack);
                        King.changePieceNum(isBlack,true);
                        return king;
                    }
                    else {
                        King king = new King(isBlack);
                        King.changePieceNum(isBlack,true);
                        return king;
                    }
                }
                else throw new Error("created too many Kings.Kings = "+String.valueOf(King.getPieceNum(isBlack)));
                //break;
            }
        }
        throw new Error("illeagal identifier");
    }

    public boolean returnTheColor() {
        return isBlack;
    }
}
