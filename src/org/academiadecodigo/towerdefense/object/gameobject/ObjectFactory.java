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
    private ScoreBoard scoreBoard;


    public ObjectFactory(RepresentableFactory factory) {

        this.factory = factory;
    }

    public void giveScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
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
               gameObject = new BaseEnemy((MovableRepresentable) factory.createRepresentableObject(type, xPos, yPos), xPos, yPos, scoreBoard);
               break;

           case BUTTON:
               gameObject = new Button(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case SCOREBOARD:
               gameObject = new ScoreBoard(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;

           case END_GAME_SCREEN:
               gameObject = new EndGameScreen(factory.createRepresentableObject(type, xPos, yPos), xPos, yPos);
               break;
       }

       return gameObject;
    }

    public AbstractObject createTile(int xPos, int yPos, TileType tileType) {

        return  new Tile(factory.createRepresentableTile(tileType, xPos, yPos), xPos, yPos, tileType);
    }

    public AbstractObject createButton(int xPos, int yPos, String path) {

        return  new Button(factory.createRepresentableButton(xPos, yPos, path), xPos, yPos);
    }

}
