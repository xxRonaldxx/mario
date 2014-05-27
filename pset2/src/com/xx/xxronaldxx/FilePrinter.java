package com.xx.xxronaldxx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by jharvard on 5/26/14.
 */
public class FilePrinter implements Printer {

    public FilePrinter(String filename){
        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(StringBuilder msg) {
        System.out.print(msg);

    }
}
