package se.liu.ida.gussv907.tddd78.lab4;

public enum Mode
{
    NORMAL ("Normal"), GHOST ("Ghost"), INVULNERABLE ("Invulnerable");

    private final String mode;

    Mode(final String mode) {
        this.mode = mode;
    }
}
