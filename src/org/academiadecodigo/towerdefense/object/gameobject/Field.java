package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Field extends AbstractObject {
    private Tile[][] tileMap;


    public Field(Representable representation, int xPos, int yPos) {

        super(representation, GameObjectType.FIELD, xPos, yPos);

        tileMap = new Tile[GameObjectType.FIELD.getCols()][GameObjectType.FIELD.getRows()];

    }


    public void init(ObjectFactory factory, int[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                switch (map[i][j]) {
                    case 0:
                        tileMap[j][i] = (Tile) factory.createTile(j, i, TileType.GRASS);
                        break;

                    case 1:
                        tileMap[j][i] = (Tile) factory.createTile(j, i, TileType.ROAD);
                        break;
                }
            }
        }
    }

    public Tile[][] getTileMap() {
        return tileMap;
    }
}


