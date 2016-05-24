package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.AbstractObject;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class Game {
    ObjectFactory factory;


    public Game(ObjectFactory factory) {

        this.factory = factory;
    }


    public void start() {

        AbstractObject field = factory.createObject(GameObjectType.FIELD);
    }
}
