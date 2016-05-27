package org.academiadecodigo.towerdefense;

import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;
import org.academiadecodigo.towerdefense.object.gameobject.PlayerBase;
import org.academiadecodigo.towerdefense.object.gameobject.enemy.BaseEnemy;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class LevelFlow {

    private static Line path;
    private static Level currentLevel;
    private static ObjectFactory factory;
    private static PlayerBase playerBase;
    private static BaseEnemy enemyBase;

    public static void drawPath(Level currentLevel) {

        switch (currentLevel) {
            case LEVEL1:
                path = new Line(getEnemyBaseX(), getEnemyBaseY(), getPlayerBaseX(), getPlayerBaseY());
                path.draw();
                break;
        }
    }

    public static void createPlayerBase() {
        playerBase = (PlayerBase) factory.createObject(GameObjectType.PLAYER_BASE);
    }

    public static void createEnemyBase() {
        enemyBase = (BaseEnemy) factory.createObject(GameObjectType.BASE_ENEMY);
    }

    public static int getPlayerBaseX() {
        return ((Representable)playerBase).getX();
    }

    public static int getPlayerBaseY() {
        return ((Representable)playerBase).getY();
    }

    public static int getEnemyBaseX() {
        return ((Representable)enemyBase).getX();
    }

    public static int getEnemyBaseY() {
        return ((Representable)enemyBase).getY();
    }
}
