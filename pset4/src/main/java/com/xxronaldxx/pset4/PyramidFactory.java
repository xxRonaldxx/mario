package com.xxronaldxx.pset4;

/**
 * Created by jharvard on 6/7/14.
 */
public class PyramidFactory {

    public Pyramid createPyramid(int h){
        Pyramid pyramid = Pyramid.getInstance(h);
        return pyramid;
    }
}
