package org.academiadecodigo.towerdefense.object.interfaces;

import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by codecadet on 23/05/16.
 */
public interface RepresentableFactory {


    Representable createRepresentableObject(GameObjectType type, int xPos, int yPos);
}
