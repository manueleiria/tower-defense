package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.PlayerBase;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 25/05/16.
 */
public class SimpleGfxPlayerBase extends SimpleGfxRepresentation {

    private static final double MARGIN_LEFT = 10;
    private static final double MARGIN_TOP = 10;


    public SimpleGfxPlayerBase(GameObjectType type) {
        super(new Rectangle(MARGIN_LEFT, MARGIN_TOP, type.getCols() * getCellSize(), type.getRows() * getCellSize()));
    }
}
