package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractEnemy extends AbstractMovableObject {
    Direction dir;

    public AbstractEnemy(MovableRepresentable representation, GameObjectType type, int xPos, int yPos) {
        super(representation, type, xPos, yPos);


    }

    public void walk(boolean isFrontPath, boolean isLeftPath, boolean isRightPath) {
        if (isFrontPath) {

        }
    }
}
