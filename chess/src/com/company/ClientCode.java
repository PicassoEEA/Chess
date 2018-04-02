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
        String[] move = null;
        while(!(inputLine.equals("quit"))){
            try {
                System.out.println(board);
                System.out.print(whitePlayer + "'s move : ");
                move = seperater(scanner.nextLine());
                while(!whitePlayer.move(move[0], move[1]))
                {
                    System.out.println("illegal move, please enter again");
                    System.out.print(whitePlayer + "'s move : ");
                    move = seperater(scanner.nextLine());
                }
                System.out.println(board);
                System.out.print(blackPlayer + "'s move : ");
                move = seperater(scanner.nextLine());
                while(!blackPlayer.move(move[0], move[1])) {
                    System.out.println("illegal move, please enter again");
                    System.out.print(blackPlayer + "'s move : ");
                    move = seperater(scanner.nextLine());
                }
            }
            catch(StringIndexOutOfBoundsException i){
                System.out.println("already quit");
                break;
            }
        }

    }
    public static String[] seperater(String input){
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
