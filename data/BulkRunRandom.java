package data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import src.main.*;

public class BulkRunRandom {


    public static void main(String[] args) {
        File file = new File("data\\sample.txt");
        PrintStream stream;
        try {
            stream = new PrintStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }
        System.setOut(stream);

        for (int i = 0; i < 1; i++) {
            //Battleship.main(new String[0]);
            Battleship.main(new String[]{"Random"});
        }   
    }

}