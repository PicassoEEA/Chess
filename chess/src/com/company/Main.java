package com.company;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        System.out.println(board);
        Player p1 = Player.createPlayer("Erit");
        Player p2 = Player.createPlayer("Skevo");
        /*p2.move("A1","C5");
        p2.move("A1","E8");
        p2.move("C2","E8");
        p2.move("H2","C3");
        p2.move("A7","A6");
        p2.move("B1","A3");*/
        p2.move("B8","A6");
        p1.move("B2","B3");
        p2.move("B7","B6");
        p2.move("C8","B7");
        p2.move("G8","H6");
        p2.move("H6","G4");
        p2.move("E7","E5");
        p2.move("F8","E7");
        p2.move("E8","G8");
        System.out.println(board);
    }
}
