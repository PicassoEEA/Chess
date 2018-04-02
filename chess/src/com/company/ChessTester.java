package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ChessTester {
    private BufferedReader br;
    public ChessTester(String path) throws Exception{

        File file = new File(path);
        br = new BufferedReader(new FileReader(file));
    }

    public String getNext() throws Exception{
        return br.readLine();
    }


    public static void main(String[] args) throws  Exception{

        ChessTester ct = new ChessTester("C:\\Users\\ericy\\Desktop\\pawnTest.txt");
        String move;
        while( (move=ct.getNext())!=null )
        {
            System.out.println(move);
        }
    }


}
