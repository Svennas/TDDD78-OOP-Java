package se.liu.ida.gussv907.tddd78.tetris;

import java.util.ArrayList;

/**
 * Created by svennas on 2/20/17.
 */
public class Poly {
    private SquareType[][] poly;
    private int size = poly.length;

    public Poly(SquareType[][] poly) {
        this.poly = poly;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
