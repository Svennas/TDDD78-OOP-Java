package se.liu.ida.gussv907.tddd78.lab4;

import java.awt.*;

public class SpeedPowerup implements Powerup
{
    public void paint(Graphics g, int x, int y) {
        g.fillRect(x, y, 10, 10);
    }

    @Override public String getDescription() {
        return "Makes a player faster";
    }

    @Override public void playerHitMe(final Player p) {
	p.setSpeed(Speed.FAST);
    }
}
