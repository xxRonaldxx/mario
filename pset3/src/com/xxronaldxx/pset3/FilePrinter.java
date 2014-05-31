package com.xxronaldxx.pset3;
import java.io.*;

/**
 * Created by jharvard on 5/30/14.
 */
public class FilePrinter implements Printer {

    PrintWriter infoToWrite = null;

    public FilePrinter(String filename) {
        try {
            File file = new File(filename);

            infoToWrite = new PrintWriter(file);
            infoToWrite.println("welcome to Mario's world");
        } catch (IOException e) {
            System.out.println("An I/O error occurred " + e.getMessage());
        }//finally{
        //    if (infoToWrite != null){
        //        infoToWrite.close();
        //    }
        //}

    }



    public void print(Pyramid msg) {

            infoToWrite.print(msg);
            infoToWrite.close();
    }
}
