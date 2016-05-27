package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractObject {
    private Representable representation;
    private GameObjectType type;


    public AbstractObject(Representable representation, GameObjectType type) {

        this.representation = representation;
        this.type = type;
    }


    public Representable getRepresentation() {

        return representation;
    }
}
