package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxEnemyBase extends SimpleGfxRepresentation {


    public SimpleGfxEnemyBase(int xPos, int yPos) {
        super(new Picture(xPos*getCellSize() + getMarginLeft(), yPos*getCellSize() + getMarginTop(), "resources/enemyBase.png"), xPos, yPos);
    }
}
