package se.liu.ida.gussv907.tddd78.lab4;

import java.awt.*;

public class GhostPowerup implements Powerup
{
    public void paint(Graphics g, int x, int y) {
        g.fillOval(x, y, 10, 10);
    }

    @Override public String getDescription() {
        return "Makes a player into a ghost that can travel through walls";
    }

    @Override public void playerHitMe(final Player p) {
    	p.setMode(Mode.GHOST);
    }
}
