package com.xx.xxronaldxx;
import java.io.*;
import java.util.Scanner;

/**
 * Created by jharvard on 5/23/14.
 */
public class pset2 {
    public static void main(String[] args)  {
        String output_choice;
        int height;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Height: ");
            height = input.nextInt();
        }while ((height<0) || (height>23));

        do {
            System.out.print("(c)onsole or (f)ile:");
            output_choice = input.next();
        }while (!((output_choice.equals("c")) || (output_choice.equals("f"))));

        if (output_choice.equals("f"))
            try {
                File file = new File("out.txt");
                FileOutputStream fos = new FileOutputStream(file);
                PrintStream ps = new PrintStream(fos);
                System.setOut(ps);
            } catch (IOException e) {
                e.printStackTrace();
            }

        for( int y = 0; y < height; y++) {
            for ( int x = height ; x > 0; x--) {
                if ((x-1)>y) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.print("#\n");
        }
    }
}
