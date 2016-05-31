package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Tile extends AbstractObject {

    private TileType tileType;


    public Tile(Representable representation, int xPos, int yPos, TileType tileType) {
        super(representation, GameObjectType.FIELD, xPos, yPos);
        this.tileType = tileType;

    }


    public TileType getTileType() {
        return tileType;
    }
}


