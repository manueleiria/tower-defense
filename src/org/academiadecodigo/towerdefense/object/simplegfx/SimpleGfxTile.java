package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.towerdefense.object.gameobject.TileType;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class SimpleGfxTile extends SimpleGfxRepresentation {


    public SimpleGfxTile(int xPos, int yPos, TileType tileType) {
        super(new Picture(xPos*getCellSize() + getMarginLeft(), yPos*getCellSize() + getMarginTop(), "resources/tiles/" + tileType.getTexDir() + ".png"), xPos, yPos);
    }
}
