package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.AbstractObject;
import org.academiadecodigo.towerdefense.object.gameobject.Field;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class Game {
    private ObjectFactory factory;
    private Level currentLevel;


    public Game(ObjectFactory factory, Level currentLevel) {

        this.currentLevel = currentLevel;
        this.factory = factory;
    }


    public void start() {

        Field field = (Field) factory.createObject(GameObjectType.FIELD);
        field.init(currentLevel);
    }
}
