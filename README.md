# Chess
This is an finished project

## contributors:
    Eric Bi
    Steven Yang
    Jeremy Xi
    Luvin Liu

## versions:
V0.1 with board initialization
V0.1.1 with factory of pieces
V0.2 move checked
v0.3 with clintcode and txt test
v1.0 functioning chess game
v1.1 the game will not determine a winner unless there are no other ways for the king to survive. (Like any other legit chess game)

## Exclusive Rules:
    1)En passant not implemented
    2)any input other than xx,xx will be regarded as command for quit

## Introduction of the game:
* There are two players in the game: player1, player2.
** movement rules of pieces:
        1) player can not eat their own pieces.
        2) player can not move pieces out of the board.
        3) player can not move the other player's pieces.
        If player don't follow the movement rule   ---------They need to move again until this movement is legal---------
*** To win:
        player need to eat opponent's King.

## Regulat movements of Pieces:
### Pawn
- Pawn can only move forward if there is no other pieces in the top left(right) corner.
- Pawn can move to the top inclined corner only one step if there have other side piece.
- It can move `one` or `two` step(s) in the first move.
- It can only move `one` step if it have already moved.
### Bishop
- The bishop can move `any number` of squares diagonally.
- it cannot leap over other pieces.
### King
- The king moves `one` square in any direction.
### Knight
- The knight moves to any of the closest squares that are not on the same rank, file, or diagonal, thus the move forms an "L"-shape: two squares vertically and one square horizontally, or two squares horizontally and one square vertically. The knight is the only piece that can leap over other pieces.
### Queen
- The queen combines the power of a rook and bishop and can move `any number` of squares along a rank, file, or diagonal, but cannot leap over other pieces.
### Rook
- The rook can move `any number` of squares along a rank or file, but cannot leap over other pieces.


## Special movements:
### Castling
Castling consists of moving the king two squares along the first rank toward a rook (which is on the player's first rank) and then placing the rook on the last square that the king has just crossed. It need to follow some conditions:
1. Neither the king nor the rook have previously moved during the game.
2. There cannot be any pieces between the king and the rook.



## Rules we do not contain
1) Promotion of Pawn
2) En passant

## Position of Testing files:
change the path for testing file in TestByTxt class
(chess/src/com/company/TestByTxt.java line 20) 







A funny hacking video just for your pleasure:
https://www.youtube.com/watch?v=msX4oAXpvUE
