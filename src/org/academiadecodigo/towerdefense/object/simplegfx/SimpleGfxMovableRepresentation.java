package org.academiadecodigo.towerdefense.object.simplegfx;


import org.academiadecodigo.towerdefense.object.gameobject.Direction;
import org.academiadecodigo.towerdefense.object.interfaces.MovableRepresentable;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Shape;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxMovableRepresentation extends SimpleGfxRepresentation implements MovableRepresentable {

    Direction dir;

    public SimpleGfxMovableRepresentation(Shape shape, int xPos, int yPos) {
        super(shape, xPos, yPos);
    }

    public void animate(int animCounter) {

    }

    @Override
    public void changeAnim(Direction dir) {
        this.dir = dir;
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

    public Direction getDir() {
        return dir;
    }
}
