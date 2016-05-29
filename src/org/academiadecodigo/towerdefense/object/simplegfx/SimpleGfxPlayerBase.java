package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxPlayerBase extends SimpleGfxRepresentation {


    public SimpleGfxPlayerBase(int xPos, int yPos) {
        super(new Picture(xPos*getCellSize() + getMarginLeft(), yPos*getCellSize() + getMarginTop(), "resources/PLAYER_BASE.png"), xPos, yPos);

    }
}
