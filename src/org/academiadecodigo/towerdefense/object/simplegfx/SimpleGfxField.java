package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxField extends SimpleGfxRepresentation {
    private static final double MARGIN_LEFT = 10;
    private static final double MARGIN_TOP = 10;



    public SimpleGfxField(GameObjectType type) {

        super(new Rectangle(MARGIN_LEFT, MARGIN_TOP, type.getCols() * getCellSize(), type.getRows() * getCellSize()));
    }
}
