package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board();
        Player p1 = Player.createPlayer("Erit");
        Player p2 = Player.createPlayer("Skevo");
        System.out.println(board);
    }
}
