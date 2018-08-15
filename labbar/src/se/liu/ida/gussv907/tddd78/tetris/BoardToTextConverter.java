package se.liu.ida.gussv907.tddd78.tetris;

/**
 * Created by svennas on 2/15/17.
 */
public class BoardToTextConverter {

    public static String convertToText(Board board) {

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < board.getHeight(); i++) {
            for(int j = 0; j < board.getWidth(); j++) {
                switch (board.getType(j, i)) {
                    case EMPTY:
                        builder.append("E");
                        break;
                    case S:
                        builder.append("S");
                        break;
                    case Z:
                        builder.append("Z");
                        break;
                    case L:
                        builder.append("L");
                        break;
                    case J:
                        builder.append("J");
                        break;
                    case T:
                        builder.append("T");
                        break;
                    case O:
                        builder.append("O");
                        break;
                    case I:
                        builder.append("I");
                        break;
                }
                if(j != board.getWidth() -1) {
                    builder.append("-");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
