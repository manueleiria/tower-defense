package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractObject implements MouseHandler {
    private Representable representation;
    private GameObjectType type;
    private int xPos;
    private int yPos;
    private Mouse mouse;



    public AbstractObject(Representable representation, GameObjectType type, int xPos, int yPos) {

        mouse = new Mouse(this);
        this.representation = representation;
        this.type = type;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    public void movePos(int dx, int dy) {
        xPos += dx;
        yPos += dy;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public Representable getRepresentation() {
        return representation;
    }
}
