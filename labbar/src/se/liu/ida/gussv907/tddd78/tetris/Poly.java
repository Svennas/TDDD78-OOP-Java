package se.liu.ida.gussv907.tddd78.tetris;

import java.util.ArrayList;

/**
 * Created by svennas on 2/20/17.
 */
public class Poly {
    private SquareType[][] poly;
    private int height, width;

    public Poly(final SquareType[][] poly) {
        this.poly = poly;
        height = poly.length;
        width = poly[0].length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}