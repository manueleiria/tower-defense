package org.academiadecodigo.towerdefense.object.gameobject.placeable;

import org.academiadecodigo.towerdefense.object.gameobject.AbstractPlaceable;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Tower extends AbstractPlaceable {


    public Tower(Representable representation) {

        super(representation, GameObjectType.TOWER);
    }
}
