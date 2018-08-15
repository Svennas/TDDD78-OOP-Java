package se.liu.ida.gussv907.tddd78.tetris;

import java.util.Random;

/**
 * Created by svennas on 2/20/17.
 */
public class TetrominoMaker {

    public int getNumberOfTypes() {
        return SquareType.values().length -1;
    }
    // -1 to get rid of EMPTY

    /*public Poly getPoly(int n) {

        Poly[][] newPoly = null;

        if(n < 0 || n > getNumberOfTypes() - 1) {
            throw new IllegalArgumentException("Invalid index: " + n);
        }
        else {
            switch(n) {
                case 0:
                    newPoly = iPoly();
                    break;
                case 1:
                    newPoly = oPoly();
                    break;
                case 2:
                    newPoly = tPoly();
                    break;
                case 3:
                    newPoly = sPoly();
                    break;
                case 4:
                    newPoly = zPoly();
                    break;
                case 5:
                    newPoly = jPoly();
                    break;
                case 6:
                    newPoly = lPoly();
                    break;
            }
        }
        return newPoly;
    }

    private Poly[][] iPoly() {
        Poly[][] type = new Poly[3][3];
        type[0][2] = Poly.I;
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
    }*/
}
