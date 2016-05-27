package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Projectile extends AbstractMovableObject {


    public Projectile(MovableRepresentable representation, int xPos, int yPos) {

        super(representation, GameObjectType.PROJECTILE, xPos, yPos);
    }
}
