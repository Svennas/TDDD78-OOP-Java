package se.liu.ida.gussv907.tddd78.tetris;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by svennas on 2/15/17.
 */
public class Board {
    private SquareType[][] squares;
    private int width, height;
    private Random rnd = new Random();
    private Poly falling;
    private int tetroX, tetroY;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.rnd = rnd;
        squares = new SquareType[height][width];
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++){
                squares[i][j] = SquareType.EMPTY;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SquareType getType(int width, int height) {
        SquareType type = squares[width][height];
        return type;
    }

    public SquareType[][] rndBoard() {
        SquareType[] rndValue = SquareType.values();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++){
                int index = rnd.nextInt(8);
                squares[i][j] = rndValue[index];
            }
        }
        return squares;
    }

    public Poly getFalling() { return falling; }

    public int getTetroX() {
        return tetroX;
    }

    public int getTetroY() {
        return tetroY;
    }

    SquareType getSquareAt(int x, int y) {
        return null;
    }

    public static void main(String[] args) {
        Board testBoard = new Board(50, 60);
        System.out.println(testBoard.getType(12, 13) + " height: " +
                testBoard.getHeight() + " width: " + testBoard.getWidth());
        for(SquareType b : SquareType.values()){
            System.out.println(" values :"+ b);
        }
    }
}
