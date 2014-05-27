package com.xx.xxronaldxx;

/**
 * Created by jharvard on 5/26/14.
 */
public class ConsolePrinter implements Printer {
    public void print(StringBuilder msg) {
        System.out.print(msg);
    }
}
