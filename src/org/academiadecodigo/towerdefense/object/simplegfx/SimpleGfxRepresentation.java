package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.towerdefense.object.representable.Representable;
import org.academiadecodigo.simplegraphics.graphics.Shape;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxRepresentation implements Representable {
    private static final double CELL_SIZE = 32;
    private Shape shape;


    public SimpleGfxRepresentation(Shape shape) {
        this.shape = shape;

        shape.draw();
    }

    public Shape getShape() {

        return shape;
    }

    @Override
    public int getX() {

        return 0;
    }

    @Override
    public int getY() {

        return 0;
    }

    public static double getCellSize() {
        return CELL_SIZE;
    }
}
