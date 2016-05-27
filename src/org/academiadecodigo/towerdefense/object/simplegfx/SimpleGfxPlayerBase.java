package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxPlayerBase extends SimpleGfxRepresentation {

    public SimpleGfxPlayerBase(GameObjectType type) {
        super(new Rectangle(, , type.getCols() * getCellSize(), type.getRows() * getCellSize()));
    }
}
