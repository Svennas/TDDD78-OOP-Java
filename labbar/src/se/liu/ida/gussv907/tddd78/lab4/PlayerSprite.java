package se.liu.ida.gussv907.tddd78.lab4;

public class PlayerSprite extends MovableObject
{

    private final String name;

    public PlayerSprite (final String name, final int x, final int y) {
	this.name = name;
        super.x = x;
        super.y = y;
    }
}
