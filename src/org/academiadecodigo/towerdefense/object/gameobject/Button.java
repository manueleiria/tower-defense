package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 04/06/16.
 */
public class Button extends  AbstractObject {

    public Button (Representable representation, int xPos, int yPos) {

        super(representation, GameObjectType.BUTTON, xPos, yPos);

    }
}
