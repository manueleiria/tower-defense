package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxEnemyBase extends SimpleGfxRepresentation {

    public SimpleGfxEnemyBase(GameObjectType type) {
        super(new Rectangle(100, 250, type.getCols() * getCellSize(), type.getRows() * getCellSize()));
    }
}
