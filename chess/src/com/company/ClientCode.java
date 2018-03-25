package com.company;
import java.util.Scanner;
public class ClientCode {
    static Scanner scanner = new Scanner(System.in);
    static Player whitePlayer = null;
    static Player blackPlayer = null;
    static Board board = new Board();

    public static void main(String[] args) {//Jeremy created at 3.23 1:12
        System.out.print("please enter the White player's name : ");
        whitePlayer = Player.createPlayer(scanner.nextLine());
        System.out.println();
        System.out.print("please enter the Black player's name : ");
        blackPlayer = Player.createPlayer(scanner.nextLine());

        String inputLine = "";
        while(!(inputLine.equals("quit"))){
            System.out.println(board);
            System.out.print(whitePlayer + "'s move : ");
            String[] move = seperater(scanner.nextLine());
            whitePlayer.move(move[0],move[1]);
            System.out.print(blackPlayer + "'s move : ");
            move = seperater(scanner.nextLine());
            blackPlayer.move(move[0],move[1]);
        }

    }
    public static String[] seperater(String input){
        String[] seperateString = new String[2];
        int positionOfcomma = 0;
        for(int i = 0; i < input.length(); i ++){
            if(input.substring(i,i + 1) == ","){
                 seperateString[positionOfcomma ] = input.substring(positionOfcomma );
                 seperateString[positionOfcomma + 1 ] = input.substring(positionOfcomma + 1,input.length() );
            }

        }
        return seperateString;
    }

}
