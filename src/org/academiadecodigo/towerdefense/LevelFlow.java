package org.academiadecodigo.towerdefense;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.towerdefense.object.gameobject.EnemyBase;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;
import org.academiadecodigo.towerdefense.object.gameobject.PlayerBase;


/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class LevelFlow {

    private static Line path;
    private static Level currentLevel;

    public static void drawPath(Level currentLevel, int playerX, int playerY, int enemyX, int enemyY) {

        switch (currentLevel) {
            case LEVEL1:
                path = new Line(enemyX * 32, enemyY* 32, playerX * 32, playerY * 32);
                path.draw();
                break;
        }
    }

    public static PlayerBase createPlayerBase(ObjectFactory factory, Level currentLevel) {

        switch (currentLevel) {

            case LEVEL1:
                return (PlayerBase) factory.createObject(GameObjectType.PLAYER_BASE, 3, 5);
            default:
                return null;
        }
    }

    public static EnemyBase createEnemyBase(ObjectFactory factory, Level currentLevel) {

        switch (currentLevel) {

            case LEVEL1:
                return (EnemyBase) factory.createObject(GameObjectType.ENEMY_BASE, 10, 5);
            default:
                return null;
        }

    }


}
