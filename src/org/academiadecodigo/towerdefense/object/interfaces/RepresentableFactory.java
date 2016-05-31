package org.academiadecodigo.towerdefense.object.interfaces;

import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.TileType;

/**
 * Created by codecadet on 23/05/16.
 */
public interface RepresentableFactory {


    Representable createRepresentableObject(GameObjectType type, int xPos, int yPos);

    Representable createRepresentableTile(TileType type, int xPos, int yPos);
}
