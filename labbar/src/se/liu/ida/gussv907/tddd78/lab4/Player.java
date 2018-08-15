package se.liu.ida.gussv907.tddd78.lab4;

public class Player
{
    private int x, y;
    private Speed speedType = Speed.MEDIUM;
    private Mode modeType = Mode.NORMAL;

    public Speed getSpeed() {
        return speedType;
    }

    public void setSpeed(final Speed speed) {
        this.speedType = speed;
    }

    public Mode getMode() {
        return modeType;
    }

    public void setMode(final Mode mode) {
        this.modeType = mode;
    }

    public void moveRight() {
        switch (speedType) {
            case SLOW:
                x += 5;
                break;
            case MEDIUM:
                x += 10;
                break;
            case FAST:
                x += 20;
                break;
        }
    }

    /**
     * Describe current speed and mode -- used for a status display
     */
    public String getDescription() {
        StringBuilder buf = new StringBuilder();
        buf.append("Player is " + speedType + " and " + modeType);

        return buf.toString();
    }

    public static void main(String[] args) {
        final Player player = new Player();
        System.out.println(player.getDescription());
    }
}
