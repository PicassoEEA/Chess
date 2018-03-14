package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board();
        Player p1 = Player.createPlayer("Erit");
        Player p2 = Player.createPlayer("Skevo");
<<<<<<< HEAD
        //int[] arr = {1,2};
        //int[] arr2 = {4,5};
        p2.move("A1","C5");
=======
        int[] arr = {1,2};
        int[] arr2 = {4,5};
        p2.move("A1","E8");
>>>>>>> 84d553994174827439e898f125a3a83b5b912b5e
        p1.move("A2","D5");
        System.out.println(board);
    }
}
