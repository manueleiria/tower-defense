package org.academiadecodigo.towerdefense.object.gameobject.enemy;

import org.academiadecodigo.towerdefense.object.gameobject.AbstractEnemy;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.interfaces.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public class BaseEnemy extends AbstractEnemy {


    public BaseEnemy(MovableRepresentable representation, int xPos, int yPos) {

        super(representation, GameObjectType.BASE_ENEMY, xPos, yPos);
    }
}
