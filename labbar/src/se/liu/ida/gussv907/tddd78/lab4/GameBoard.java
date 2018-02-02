package se.liu.ida.gussv907.tddd78.lab4;

public class GameBoard
{
    private enum CellType
    {
	EMPTY(false), TREE(true), BUILDING(true), ROCK(true), POWERUP(false), BORDER(true);

	public final boolean isObstacle;

	CellType(final boolean isObstacle) {
	    this.isObstacle = isObstacle;
	}
    }

    public enum Move {
        DOWN(0,1), UP(0,-1), RIGHT(1,0), LEFT(-1,0);

        public final int deltaX;
        public final int deltaY;

        Move(final int deltaX, final int deltaY) {
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }
    }

    private CellType[][] cells;
    private int currentX, currentY;

    public GameBoard(int width, int height) {
	this.cells = new CellType[height][width];
	this.currentX = width / 2;
	this.currentY = height / 2;
    }

    public void moveDown() {
	if (canMove(1, 0)) {
	    currentY++;
	}
    }

    public void moveUp() {
	if (canMove(-1, 0)) {
	    currentY--;
	}
    }

    public void moveRight() {
	if (canMove(0, 1)) {
	    currentX++;
	}
    }

    public void moveLeft() {
	if (canMove(0, -1)) {
	    currentX--;
	}
    }

    public boolean canMove(int deltaY, int deltaX) {
           return !cells[currentY + deltaY][currentX + deltaX].isObstacle;
    }


}

