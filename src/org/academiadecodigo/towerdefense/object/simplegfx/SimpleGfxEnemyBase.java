package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.towerdefense.Game;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxEnemyBase extends SimpleGfxRepresentation {

    public SimpleGfxEnemyBase(GameObjectType type, int xPos, int yPos) {
        super(new Rectangle(xPos*getCellSize() + getMarginLeft(), yPos*getCellSize() + getMarginTop(), type.getCols() * getCellSize(), type.getRows() * getCellSize()), xPos, yPos);
    }
}
