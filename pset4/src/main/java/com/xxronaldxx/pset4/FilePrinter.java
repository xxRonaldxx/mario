package com.xxronaldxx.pset4;
import java.io.*;


/**
 * Created by jharvard on 6/7/14.
 */
public class FilePrinter implements Printer  {
    PrintWriter infoToWrite = null;
    String  filename = "out.txt";


    //example of using the singleton pattern
    private static FilePrinter filePrinter;

    public static FilePrinter getInstance(){

        if (filePrinter == null){
            filePrinter = new FilePrinter();
        }
        return filePrinter;
    }



    public void print(Pyramid msg)  {
        try {
            File file = new File(filename);

            infoToWrite = new PrintWriter(file);
            infoToWrite.println("welcome to Mario's world");
            infoToWrite.print(msg);
            infoToWrite.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred " + e.getMessage());
        }finally{
            if (infoToWrite != null){
                infoToWrite.close();
            }
        }

    }
}
