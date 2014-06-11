package com.xxronaldxx.pset4;;

/**
 * Created by jharvard on 6/7/14.
 */
public class ConsolePrinter implements Printer {

    //example of using the singleton pattern
    private static ConsolePrinter consolePrinter;

    public static ConsolePrinter getInstance(){
        if (consolePrinter == null){
            consolePrinter = new ConsolePrinter();
        }
        return consolePrinter;
    }

    public void print(Pyramid msg) {
        System.out.print(msg);
    }
}
