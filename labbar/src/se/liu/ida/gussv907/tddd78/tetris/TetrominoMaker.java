package se.liu.ida.gussv907.tddd78.tetris;

import java.util.Random;

/**
 * Created by svennas on 2/20/17.
 */
public class TetrominoMaker {

    public int getNumberOfTypes() {
        return SquareType.values().length;
    }

    public Poly getPoly(int n) {
        SquareType[][] squares = null;

        if(n < 0 || n > getNumberOfTypes() - 1) {
            throw new IllegalArgumentException("Invalid index: " + n);
        }
        else {
            switch(n) {
                case 0:
                    squares = null;
                    break;
                case 1:
                    squares = iPoly();
                    break;
                case 2:
                    squares = oPoly();
                    break;
                case 3:
                    squares = tPoly();
                    break;
                case 4:
                    squares = sPoly();
                    break;
                case 5:
                    squares = zPoly();
                    break;
                case 6:
                    squares = jPoly();
                    break;
                case 7:
                    squares = lPoly();
                    break;
            }
        }
        Poly sqPoly = new Poly(squares);
        return sqPoly;
    }

    private SquareType[][] iPoly() {
        SquareType[][] type = new SquareType[3][3];
        type[0][2] = SquareType.I;
        type[1][2] = SquareType.I;
        type[2][2] = SquareType.I;
        type[3][2] = SquareType.I;
        return type;
    }

    private SquareType[][] oPoly() {
        SquareType[][] type = new SquareType[1][1];
        type[0][0] = SquareType.O;
        type[0][1] = SquareType.O;
        type[1][0] = SquareType.O;
        type[1][1] = SquareType.O;
        return type;
    }

    private SquareType[][] tPoly() {
        SquareType[][] type = new SquareType[2][2];
        type[1][0] = SquareType.T;
        type[1][1] = SquareType.T;
        type[1][2] = SquareType.T;
        type[2][1] = SquareType.T;
        return type;
    }

    private SquareType[][] sPoly() {
        SquareType[][] type = new SquareType[2][2];
        type[0][1] = SquareType.S;
        type[0][2] = SquareType.S;
        type[1][0] = SquareType.S;
        type[1][1] = SquareType.S;
        return type;
    }

    private SquareType[][] zPoly() {
        SquareType[][] type = new SquareType[2][2];
        type[0][0] = SquareType.Z;
        type[0][1] = SquareType.Z;
        type[1][1] = SquareType.Z;
        type[1][2] = SquareType.Z;
        return type;
    }

    private SquareType[][] jPoly() {
        SquareType[][] type = new SquareType[2][2];
        type[0][1] = SquareType.J;
        type[1][1] = SquareType.J;
        type[2][0] = SquareType.J;
        type[2][1] = SquareType.J;
        return type;
    }

    private SquareType[][] lPoly() {
        SquareType[][] type = new SquareType[2][2];
        type[0][1] = SquareType.L;
        type[1][1] = SquareType.L;
        type[2][1] = SquareType.L;
        type[2][2] = SquareType.L;
        return type;
    }
}
