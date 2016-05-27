package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractEnemy extends AbstractMovableObject {
        int xPos;
        int yPos;

    public AbstractEnemy(MovableRepresentable representation, GameObjectType type) {
        super(representation, type);

    }

    public void walk(Boolean[][] path) {

    }
}
