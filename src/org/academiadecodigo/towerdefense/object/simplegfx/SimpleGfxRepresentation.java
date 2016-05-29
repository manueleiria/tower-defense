package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.simplegraphics.graphics.Shape;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxRepresentation implements Representable {
    private static final double CELL_SIZE = 32;
    private static final double MARGIN_LEFT = 10;
    private static final double MARGIN_TOP = 10;

    private Shape shape;
    private int xPos;
    private int yPos;


    public SimpleGfxRepresentation(Shape shape, int xPos, int yPos) {
        this.shape = shape;
        this.xPos = xPos * (int) CELL_SIZE;
        this.yPos = yPos * (int) CELL_SIZE;
        shape.draw();
    }

    public Shape getShape() {

        return shape;
    }

    @Override
    public int getXPos() {

        return xPos;
    }

    @Override
    public int getYPos() {

        return yPos;
    }

    public static double getCellSize() {
        return CELL_SIZE;
    }

    public static double getMarginLeft() {
        return MARGIN_LEFT;
    }

    public static double getMarginTop() {
        return MARGIN_TOP;
    }
}
