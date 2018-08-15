package se.liu.ida.gussv907.tddd78.lab4;

import javax.swing.*;
import java.awt.*;


public class TextViewer extends JComponent {

    private static final int LEFT_ALIGNED = 0;
    private static final int WIDTH = 600;
    private static final int HEIGTH = 300;
    private static final int FONT_SIZE = 12;
    private static final int ROW_DISTANCE = 1;
    private static final int PARAGRAPH_DISTANCE = 4;

    private int startX = LEFT_ALIGNED;
    private int paragraph = 0;
    private int row = 0;

    public TextViewer() throws HeadlessException {
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TextViewer");
        frame.add(new TextViewer());
        frame.pack();
        frame.setVisible(true);
    }

    public void drawRow(Graphics g, String text) {
	row = row + 1;
        g.drawString(text, startX, ((row+1)*FONT_SIZE + row*ROW_DISTANCE + paragraph*PARAGRAPH_DISTANCE));

    }

    @Override protected void paintComponent(final Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("serif", Font.PLAIN, FONT_SIZE));

        drawRow(g, "This is the first line of the first paragraph of text");
	drawRow(g, "it is followed by the second line of the text");
        drawRow(g, "Which is followed by the third line of text.");

        paragraph += 1;

        drawRow(g, "Start of the second paragraph of text.");
        drawRow(g, "Continuation of the second paragraph of text.");
        drawRow(g, "Conclusion of the second paragraph of text.");

        paragraph += 1;

        drawRow(g, "Start of the third paragraph of text.");
	drawRow(g, "Continuation of the third paragraph of text.");
	drawRow(g, "Conclusion of the third paragraph of text.");
    }
}


