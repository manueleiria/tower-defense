package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractMovableObject extends AbstractObject {


    public AbstractMovableObject(MovableRepresentable representation) {

        super(representation);
    }


    public void move(int dy) {

        ((MovableRepresentable) getRepresentation()).move(dy);
    }


    public void move(int dx, int dy) {

        ((MovableRepresentable)getRepresentation()).move(dx, dy);
    }
}
