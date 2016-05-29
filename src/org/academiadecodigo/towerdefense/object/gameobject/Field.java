package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Field extends AbstractObject {

    private PlayerBase playerBase;
    private EnemyBase enemyBase;
    private boolean[][] tileMap;


    public Field(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.FIELD, xPos, yPos);

    }


    public void init() {

        for (int i = 0; i < tileMap.length; i++) {
            for (int j = 0; j < tileMap[i].length; j++) {
                if (tileMap[i][j] == true) {
                    Rectangle rec = new Rectangle(i*32+10, j*32+10, 32, 32);
                    rec.draw();
                }
            }

        }
    }

    public void setTileMap(boolean[][] tileMap) {
        this.tileMap = tileMap;
    }

    public boolean[][] getTileMap() {
        return tileMap;
    }

}


