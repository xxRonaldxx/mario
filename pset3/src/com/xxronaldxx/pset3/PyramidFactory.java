package com.xxronaldxx.pset3;

/**
 * Created by jharvard on 5/30/14.
 */
public class PyramidFactory {
    public Pyramid createPyramid(int h){
        Pyramid pyramid = new Pyramid(h);
        return pyramid;
    }
}
