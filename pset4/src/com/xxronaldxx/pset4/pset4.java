package com.xxronaldxx.pset4;
import java.util.Scanner;

/**
 * Created by jharvard on 6/7/14.  /home/jharvard/github/launchcode-java-class/pset4 <=====
 */
public class pset4 {
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

        Printer choice = (output_choice.equals("f")) ? new FilePrinter("out.txt") : new ConsolePrinter();

        PyramidFactory factory = new PyramidFactory();

        choice.print(factory.createPyramid(height));

    }
}
