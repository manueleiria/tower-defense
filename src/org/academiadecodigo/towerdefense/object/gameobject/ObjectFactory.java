package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.gameobject.placeable.*;
import org.academiadecodigo.towerdefense.object.gameobject.enemy.*;
import org.academiadecodigo.towerdefense.object.interfaces.MovableRepresentable;
import org.academiadecodigo.towerdefense.object.interfaces.RepresentableFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class ObjectFactory {
    private RepresentableFactory factory;


    public ObjectFactory(RepresentableFactory factory) {

        this.factory = factory;
    }


    public AbstractObject createObject(GameObjectType type, int xPos, int yPos) {
       AbstractObject gameObject = null;

       switch (type) {

           case FIELD:
               gameObject = new Field(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case PLAYER_BASE:
               gameObject = new PlayerBase(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case ENEMY_BASE:
               gameObject = new EnemyBase(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case PROJECTILE:
               gameObject = new Projectile((MovableRepresentable) factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case TOWER:
               gameObject = new Tower(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case BASE_ENEMY:
               gameObject = new BaseEnemy((MovableRepresentable) factory.createRepresentableObject(type, xPos, yPos), xPos, yPos, 10);
               break;
           case MENU:
               gameObject = new Menu(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);

       }

       return gameObject;
    }

    public AbstractObject createTile(int xPos, int yPos, TileType tileType) {

        return  new Tile(factory.createRepresentableTile(tileType, xPos, yPos), xPos, yPos, tileType);
    }
}
