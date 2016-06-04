package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxField extends SimpleGfxRepresentation {


    public SimpleGfxField(GameObjectType type, int xPos, int yPos) {

        super(new Rectangle(xPos * getCellSize() + getMarginLeft(), yPos * getCellSize() + getMarginTop(), type.getCols() * getCellSize(), type.getRows() * getCellSize()), xPos, yPos);
        ((Rectangle)getShape()).setColor(Color.WHITE);
    }
}
