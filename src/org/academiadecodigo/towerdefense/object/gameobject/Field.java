package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.Level;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Field extends AbstractObject {
    int xPlayerBase;
    int yPlayerBase;
    int xEnemyBase;
    int yEnemyBase;
    private boolean[][] path;


    public Field(Representable representation) {
        super(representation, GameObjectType.FIELD);
    }


    public void init(Level currentLevel) {

    }


    public boolean[][] getPath() {
        return path;
    }

}
