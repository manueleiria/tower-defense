package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.gameobject.placeable.*;
import org.academiadecodigo.towerdefense.object.gameobject.enemy.*;
import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;
import org.academiadecodigo.towerdefense.object.representable.RepresentableFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class ObjectFactory {
    private RepresentableFactory factory;


    public ObjectFactory(RepresentableFactory factory) {

        this.factory = factory;
    }


    public AbstractObject createObject(GameObjectType type) {
       AbstractObject gameObject = null;

       switch (type) {

           case FIELD:
               gameObject = new Field(factory.createRepresentableObject(type));
               break;

           case PLAYER_BASE:
               gameObject = new PlayerBase(factory.createRepresentableObject(type));
               break;

           case PROJECTILE:
               gameObject = new Projectile((MovableRepresentable) factory.createRepresentableObject(type));
               break;

           case TOWER:
               gameObject = new Tower(factory.createRepresentableObject(type));
               break;

           case BASE_ENEMY:
               gameObject = new BaseEnemy((MovableRepresentable) factory.createRepresentableObject(type));
               break;
       }

       return gameObject;
   }
}