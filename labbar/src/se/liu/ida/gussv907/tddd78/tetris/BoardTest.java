package se.liu.ida.gussv907.tddd78.tetris;

/**
 * Created by svennas on 2/15/17.
 */
public class BoardTest {

    public static void main(String[] args) {
        Board testBoard = new Board(5, 5);
        System.out.println(BoardToTextConverter.convertToText(testBoard));

        for(int i = 0; i < 10; i++) {
            testBoard.rndBoard();
            System.out.println(BoardToTextConverter.
                    convertToText(testBoard));
        }

        TetrominoMaker test = new TetrominoMaker();

        System.out.println(test.getNumberOfTypes());
    }
}
