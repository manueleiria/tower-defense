package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractObject {
    private Representable representation;
    private GameObjectType type;
    private int xPos;
    private int yPos;


    public AbstractObject(Representable representation, GameObjectType type, int xPos, int yPos) {

        this.representation = representation;
        this.type = type;
        this.xPos = xPos;
        this.yPos = yPos;
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
