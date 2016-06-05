package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 05/06/16.
 */
public class ScoreBoard extends AbstractObject{


    public ScoreBoard(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.SCOREBOARD, xPos, yPos);

    }


}
