package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board();
        Player p1 = Player.createPlayer("Erit");
        Player p2 = Player.createPlayer("Skevo");
        int[] arr = {1,2};
        int[] arr2 = {4,5};
        p2.move("A1","E8");
        p1.move("A2","D5");
        System.out.println(board);
    }
}
