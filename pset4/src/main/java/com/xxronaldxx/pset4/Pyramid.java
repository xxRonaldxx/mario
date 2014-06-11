package com.xxronaldxx.pset4;

/**
 * Created by jharvard on 6/7/14.
 */
public class Pyramid {

    StringBuilder sb = new StringBuilder();

    //example of using the singleton pattern
    private static Pyramid pyramid;

    public static Pyramid getInstance(int h){
        if (pyramid == null){
            pyramid = new Pyramid(h);
        }
        return pyramid;
    }

    private Pyramid(int height){

        for( int y = 0; y < height; y++) {
            for ( int x = height ; x > 0; x--) {
                if ((x-1)>y) {
                    sb.append(" ");
                }
                else {
                    sb.append("#");
                }
            }
            sb.append("#\n");
        }
    }

    public String toString() {
        return sb.toString();
    }
}
