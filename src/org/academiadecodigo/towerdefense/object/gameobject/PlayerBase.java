package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class PlayerBase extends AbstractObject {


    public PlayerBase(Representable representation, int xPos, int yPos) {

        super(representation, GameObjectType.PLAYER_BASE, xPos, yPos);
    }
}
