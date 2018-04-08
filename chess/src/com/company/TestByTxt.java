package com.company;
import java.io.*;
public class TestByTxt {




    //static Scanner scanner = new Scanner(System.in);





    static Player whitePlayer = null;
    static Player blackPlayer = null;
    static Board board = new Board();

    public static void main(String[] args) {//Jeremy created at 3.23 1:12
        try {
            File directory = new File("");

            String curPath = directory.getAbsolutePath();
            //ChessTester ct = new ChessTester(curPath+"\\..\\TestingFiles\\checkMateTest.txt");
            ChessTester ct = new ChessTester("/Users/steeevo/Desktop/School/CS/Chess/TestingFiles/endGameTest.txt");
            System.out.print("please enter the White player's name : ");
            whitePlayer = Player.createPlayer("player1");
            System.out.println();
            System.out.print("please enter the Black player's name : ");
            blackPlayer = Player.createPlayer("player2");
            System.out.println();

            String inputLine = "";
            String[] move = null;
            while(move == null || !(move[0].equals("quit"))){
                try {
                    System.out.println("================================");
                    System.out.println(board);
                    System.out.println("================================");
                    System.out.print(whitePlayer + "'s move : ");
                    move = seperater(ct.getNext());
                    while(!whitePlayer.move(move[0], move[1]))
                    {
                        System.out.println("illegal move, please enter again");
                        System.out.print(whitePlayer + "'s move : ");
                        move = seperater(ct.getNext());
                    }
                    if (Board.endGame(true)){
                        System.out.println("white player wins!!");
                        break;
                    }
                    System.out.println("================================");
                    System.out.println(board);
                    System.out.println("================================");
                    System.out.print(blackPlayer + "'s move : ");
                    move = seperater(ct.getNext());
                    while(!blackPlayer.move(move[0], move[1])) {
                        System.out.println("illegal move, please enter again");
                        System.out.print(blackPlayer + "'s move : ");
                        move = seperater(ct.getNext());
                    }
                    if (Board.endGame(false)){
                        System.out.println("black player wins!!");
                        break;
                    }
                }
                catch(StringIndexOutOfBoundsException i){
                    System.out.println("already quit");
                    break;
                }
            }
        }
        catch (Exception i){
            System.out.println(i);
            System.out.println("quit");
        }


    }
    private static String[] seperater(String input){
        String[] seperateString = new String[2];
        int positionOfcomma = 0;
        for(int i = 0; i < input.length(); i ++){
            /*if(input.substring(i,i + 1) == ","){
                 seperateString[positionOfcomma ] = input.substring(positionOfcomma );
                 seperateString[positionOfcomma + 1 ] = input.substring(positionOfcomma + 1,input.length() );
            }*/
            if (input.substring(i,i+1).equals(","))
                positionOfcomma = i;
        }
        seperateString[0] = input.substring(0,positionOfcomma);
        seperateString[1] = input.substring(positionOfcomma + 1,input.length() );
        return seperateString;
    }


}
