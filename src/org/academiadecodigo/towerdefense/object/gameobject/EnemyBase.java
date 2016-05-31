package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class EnemyBase extends AbstractObject {


    public EnemyBase(Representable representation, int xPos, int yPos) {

        super(representation, GameObjectType.ENEMY_BASE, xPos, yPos);
    }
}
