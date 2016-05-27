package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.Level;
import org.academiadecodigo.towerdefense.LevelFlow;
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


    public Field(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.FIELD, xPos, yPos);
    }


    public void init(Level currentLevel) {
        LevelFlow.createPlayerBase();
        LevelFlow.createEnemyBase();
        LevelFlow.drawPath(currentLevel);
    }


    public boolean[][] getPath() {
        return path;
    }

}
