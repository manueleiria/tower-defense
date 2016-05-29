package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.TileType;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.towerdefense.object.interfaces.RepresentableFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxRepresentableFactory implements RepresentableFactory {


    @Override
    public Representable createRepresentableObject(GameObjectType type, int xPos, int yPos) {
        Representable representable = null;

        switch (type) {

            case FIELD:
                representable = new SimpleGfxField(type, xPos, yPos);
                break;

            case PLAYER_BASE:
                representable = new SimpleGfxPlayerBase(xPos, yPos);
                break;

            case ENEMY_BASE:
                representable = new SimpleGfxEnemyBase(type, xPos, yPos);
                break;

            case PROJECTILE:
                representable = null;
                break;

            case TOWER:
                representable = null;
                break;

            case BASE_ENEMY:
                representable = new SimpleGfxEnemy(type, xPos, yPos);
                break;
        }

        return representable;
    }

    public Representable createRepresentableTile(int xPos, int yPos, TileType tileType) {
       return new SimpleGfxTile(xPos, yPos, tileType);
    }
}
