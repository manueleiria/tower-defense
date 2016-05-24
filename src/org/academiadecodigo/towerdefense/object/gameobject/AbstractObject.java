package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractObject {
    private Representable representation;


    public AbstractObject(Representable representation) {

        this.representation = representation;
    }


    public Representable getRepresentation() {

        return representation;
    }
}
