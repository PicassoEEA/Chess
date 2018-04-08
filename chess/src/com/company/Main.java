package com.company;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        //System.out.println(board);
        Player p1 = Player.createPlayer("Erit");
        Player p2 = Player.createPlayer("Skevo");
        /*p2.move("A1","C5");
        p2.move("A1","E8");
        p2.move("C2","E8");
        p2.move("H2","C3");
        p2.move("A7","A6");
        p2.move("B1","A3");*/
        p1.move("E2","E3");
        p1.move("F1","B5");
        p1.move("B5","D7");
        System.out.println(board);
        p2.move("E7","E6");
        System.out.println(board);
        p2.move("E8","D7");
        //p1.move("E1","F1");
        //p1.move("F1","E1");
        //p1.move("E1","G1");
        System.out.println(board);
    }
}
