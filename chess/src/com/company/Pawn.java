package com.company;

public class Pawn extends Piece {

    protected static int numOfWhitePieces = 0;
    protected static int numOfBlackPieces = 0;
    private boolean moved = false;
    public boolean isBlack;// false for white and true for black
    //static int step = 0;

    protected Pawn(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public String toString() {
        if (isBlack)
            return "BP ";
        else
            return "WP ";
    }

    public static int getPieceNum(boolean isBlack) {
        if (isBlack)
            return numOfBlackPieces;
        else
            return numOfWhitePieces;
    }

    public static void changePieceNum(boolean isBlack, boolean isAdd) {
        if (isBlack) {
            if (isAdd)
                numOfBlackPieces += 1;
            else
                numOfBlackPieces -= 1;
        } else {
            if (isAdd)
                numOfWhitePieces += 1;
            else
                numOfWhitePieces -= 1;
        }
    }

    public boolean checkMove(int[] startPos, int[] endPos) { //Luvin created Stevo modified !!This mehthod is not completed because it requires getIsBlack()
        Piece[] frontView = Board.getView(startPos, isBlack);
        if (isBlack) //Black piece
        {
            if (startPos[0] == endPos[0] && frontView[1] == null && startPos[1] - endPos[1] <= 2) // Going straight
            {
                if (!moved && startPos[1] - endPos[1] == 2) { //first time move
                    moved = false;
                    return true;
                } else
                    return true;        //normal move
            } else if (Math.abs(startPos[0] - endPos[0]) == 1 && Math.abs(startPos[1] - endPos[1]) == 1) // going diagonal
            {
                if (startPos[0] - endPos[0] == 1 && frontView[0] != null)// &&frontView[0].getIsBlack()) //left
                {
                    return true;
                } else if (startPos[0] - endPos[0] == -1 && frontView[2] != null )//&& !frontView[2].getIsBlack()) //right
                {
                    return true;
                } else
                    return false;
            }
        } else {
            if (startPos[0] == endPos[0] && frontView[1] == null && startPos[1] - endPos[1] >= -2) // Going straight
            {
                if (!moved && startPos[1] - endPos[1] == -2) { //first time move
                    moved = false;
                    return true;
                } else
                    return true;        //normal move
            } else if (Math.abs(startPos[0] - endPos[0]) == 1 && Math.abs(startPos[1] - endPos[1]) == 1) // going diagonal
            {
                if (startPos[0] - endPos[0] == -1 && frontView[0] != null)//&& frontView[2].getIsBlack()) //left
                {
                    return true;
                } else if (startPos[0] - endPos[0] == 1&& frontView[2] != null)//&& !frontView[0].getIsBlack()) //right
                {
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }
}
