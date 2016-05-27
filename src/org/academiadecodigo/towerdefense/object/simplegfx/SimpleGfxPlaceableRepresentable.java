package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.towerdefense.object.gameobject.AbstractPlaceable;
import org.academiadecodigo.towerdefense.object.gameobject.placeable.Tower;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 27/05/16.
 */
public abstract class SimpleGfxPlaceableRepresentable extends Tower {

    public SimpleGfxPlaceableRepresentable(Representable representation, int posX, int posY, int damage) {
        super(representation, posX, posY, damage);
    }

}
