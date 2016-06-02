package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.interfaces.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractMovableObject extends AbstractObject {



    public AbstractMovableObject(MovableRepresentable representation, GameObjectType type, int xPos, int yPos) {

        super(representation, type, xPos, yPos);
    }

    public void animate(int animCounter) {
        ((MovableRepresentable) getRepresentation()).animate(animCounter);
    }


    public void move(int dx, int dy) {
        movePos(dx, dy);
    }


    public void moveRepresentable(int dx, int dy) {
        ((MovableRepresentable)getRepresentation()).move(dx, dy);
    }
}
