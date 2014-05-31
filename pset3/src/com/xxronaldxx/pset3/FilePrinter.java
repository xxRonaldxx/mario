package com.xxronaldxx.pset3;
import java.io.*;

/**
 * Created by jharvard on 5/30/14.
 */
public class FilePrinter implements Printer {
    FileOutputStream fos = null;

    // save original output
    PrintStream std = System.out;

    public FilePrinter(String filename) {
        try {

            // setup the file to redirect to
            File file = new File(filename);
            fos = new FileOutputStream(file);

            // replace the System.out, redirect to the file
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (IOException e) {
            // use the original output stream to output
            std.println("There was a problem finding the file " + e.getMessage());
            try {
                System.setOut(std);
                fos.close();
            } catch (IOException e2) {
                // use the original output stream to output
                System.out.println("There was a problem finding the file " + e2.getMessage());
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e3) {
                        System.out.println("There was a problem closing the file " + e3.getMessage());
                    }
                }
            }
        }
    }



    public void print(Pyramid msg) {
        System.out.print(msg);

    }
}
