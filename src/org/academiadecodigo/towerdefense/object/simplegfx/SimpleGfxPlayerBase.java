package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.PlayerBase;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 25/05/16.
 */
public class SimpleGfxPlayerBase extends PlayerBase {

    private int hitPoints = 100;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    private static final double MARGIN_LEFT = 10;
    private static final double MARGIN_TOP = 10;



    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int damage) {
        this.hitPoints -= damage;
    }

    public SimpleGfxPlayerBase() {
        super((Representable) new Rectangle(MARGIN_LEFT, MARGIN_TOP, WIDTH, HEIGHT));
    }
}
