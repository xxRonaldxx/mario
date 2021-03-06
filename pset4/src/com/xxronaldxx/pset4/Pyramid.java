package com.xxronaldxx.pset4;

/**
 * Created by jharvard on 6/7/14.
 */
public class Pyramid {
    int height;
    StringBuilder sb = new StringBuilder();

    Pyramid(int h){
        height = h;
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
