package se.liu.ida.gussv907.tddd78.tetris;

/**
 * Created by svennas on 2/15/17.
 */
public class Board {
    private SquareType[][] squares;
    private int width, height;

    public Board(int width, int height) {
        squares = new SquareType[height][width];
        for(int i = 0; i < height; i++) {this.width = width;
            this.height = height;
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

    public static void main(String[] args) {
        Board testBoard = new Board(50, 60);
        System.out.println(testBoard.getType(12, 13) + " height: " +
                testBoard.getHeight() + " width: " + testBoard.getWidth());
    }
}
