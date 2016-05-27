package org.academiadecodigo.towerdefense.object.simplegfx;


import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxEnemy extends SimpleGfxMovableRepresentation {


    public SimpleGfxEnemy(Shape shape, int xPos, int yPos) {
        super(shape, xPos, yPos);
    }


    public void move(int dy) {

        if (getShape() instanceof Movable) {

            ((Movable) getShape()).translate(0, dy);
        }
    }


    public void move(int dx, int dy) {

        if (getShape() instanceof Movable) {

            ((Movable) getShape()).translate(dx, dy);
        }
    }
}
