package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractPlaceable extends AbstractObject {


    public AbstractPlaceable(Representable representation, GameObjectType type, int xPos, int yPos) {

        super(representation, type, xPos, yPos);
    }
}
