package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.Level;
import org.academiadecodigo.towerdefense.LevelFlow;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Field extends AbstractObject {

    private PlayerBase playerBase;
    private EnemyBase enemyBase;
    private boolean[][] path;


    public Field(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.FIELD, xPos, yPos);
    }


    public void init(ObjectFactory factory, Level currentLevel) {
        playerBase = LevelFlow.createPlayerBase(factory, currentLevel);
        enemyBase = LevelFlow.createEnemyBase(factory, currentLevel);
        LevelFlow.drawPath(currentLevel, playerBase.getxPos(), playerBase.getyPos(), enemyBase.getxPos(), enemyBase.getyPos());
    }


    public boolean[][] getPath() {
        return path;
    }

}


