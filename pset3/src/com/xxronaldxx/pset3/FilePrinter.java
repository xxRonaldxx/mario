package com.xxronaldxx.pset3;
import java.io.*;

/**
 * Created by jharvard on 5/30/14.
 */
public class FilePrinter implements Printer {

    PrintWriter infoToWrite = null;
    String filename;

    public FilePrinter(String f) {
        filename = f;
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
