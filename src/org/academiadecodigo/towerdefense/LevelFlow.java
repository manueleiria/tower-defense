package org.academiadecodigo.towerdefense;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.towerdefense.object.gameobject.*;


/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class LevelFlow {
    private static final int LEVEL_AMOUNT = 1;

    private static int[] actionAmount;

    private static int[] playerBaseX;
    private static int[] playerBaseY;

    private static int[] enemyBaseX;
    private static int[] enemyBaseY;

    private static int[] enemyAmount;

    private static int[] enemySpawnX;
    private static int[] enemySpawnY;


    public static boolean[][] drawPath(Level currentLevel) {
        boolean[][] path = new boolean[GameObjectType.FIELD.getCols()][GameObjectType.FIELD.getRows()];

        switch (currentLevel) {
            case LEVEL1:
                for (int i = 6; i < 29; i++) {
                    path[i][9] = true;
                }
        }
        return path;
    }


    public static void init() {
        actionAmount = new int[LEVEL_AMOUNT];

        playerBaseX = new int[LEVEL_AMOUNT];
        playerBaseY = new int[LEVEL_AMOUNT];

        enemyBaseX = new int[LEVEL_AMOUNT];
        enemyBaseY = new int[LEVEL_AMOUNT];

        enemyAmount = new int[LEVEL_AMOUNT];

        enemySpawnX = new int[LEVEL_AMOUNT];
        enemySpawnY = new int[LEVEL_AMOUNT];


        actionAmount[0] = 7;

        playerBaseX[0] = 3;
        playerBaseY[0] = 8;

        enemyBaseX[0] = 29;
        enemyBaseY[0] = 8;

        enemyAmount[0] = 10;

        enemySpawnX[0] = 29;
        enemySpawnY[0] = 9;
    }


    public static int getActionAmount(Level currentLevel) {
        return actionAmount[currentLevel.getLevelId()];
    }

    public static int getPlayerBaseX(Level currentLevel) {
        return playerBaseX[currentLevel.getLevelId()];
    }

    public static int getPlayerBaseY(Level currentLevel) {
        return playerBaseY[currentLevel.getLevelId()];
    }

    public static int getEnemyBaseX(Level currentLevel) {
        return enemyBaseX[currentLevel.getLevelId()];
    }

    public static int getEnemyBaseY(Level currentLevel) {
        return enemyBaseY[currentLevel.getLevelId()];
    }

    public static int getEnemyAmount(Level currentLevel) {
        return enemyAmount[currentLevel.getLevelId()];
    }

    public static int getEnemySpawnX(Level currentLevel) {
        return enemySpawnX[currentLevel.getLevelId()];
    }

    public static int getEnemySpawnY(Level currentLevel) {
        return enemySpawnY[currentLevel.getLevelId()];
    }


    public static Action doNext(Level currentLevel, int actionCounter) {

        switch (currentLevel) {
            case LEVEL1:
                return levelOneFlow(actionCounter);
        }
        return null;
    }


    private static Action levelOneFlow(int actionCounter) {

        switch (actionCounter) {
            case 0:
                return Action.DO_NOTHING;
            case 1:
                return Action.DO_NOTHING;
            case 2:
                return Action.DO_NOTHING;
            case 3:
                return Action.DO_NOTHING;
            case 4:
                return Action.CREATE_ENEMY;
            case 5:
                return Action.DO_NOTHING;
            case 6:
                return Action.CREATE_ENEMY;
        }
        return null;
    }

}
