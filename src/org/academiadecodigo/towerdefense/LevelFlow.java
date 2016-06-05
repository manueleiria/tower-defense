package org.academiadecodigo.towerdefense;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class LevelFlow {
    private static final int LEVEL_AMOUNT = 3;

    private static int[] actionAmount;

    private static int[] playerBaseX;
    private static int[] playerBaseY;

    private static int[] enemyBaseX;
    private static int[] enemyBaseY;

    private static int[] enemyAmount;

    private static int[] enemySpawnX;
    private static int[] enemySpawnY;

    private static int[] playerBaseDoorX;
    private static int[] playerBaseDoorY;


    public static int[][] drawMap(Level currentLevel) {
        switch (currentLevel) {

            case LEVEL1:
                return new int[][] {
                        {2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2},
                        {2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,2,2},
                        {2,2,2,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,2,2},
                        {2,2,2,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,1,0,2,2},
                        {2,2,2,0,1,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,1,2,2,2},
                        {2,2,2,2,1,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,0},
                        {0,0,0,2,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0},
                        {0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0},
                        {0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                };

            case LEVEL2:
                return new int[][] {
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,2,2},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,1,0,2,2},
                        {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,1,2,2,2},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {2,0,0,0,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                        {2,0,0,0,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {2,0,1,0,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {2,2,1,2,2,2,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {2,2,1,1,1,2,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

                };

            case LEVEL3:
                return new int[][] {
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,2,2},
                        {2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,1,0,2,2},
                        {2,2,2,2,2,2,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,1,2,2,2},
                        {2,2,0,0,0,2,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
                        {2,2,0,0,0,2,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0},
                        {2,2,0,1,0,2,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {2,2,2,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,2,2,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                        {2,2,2,2,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

                };
        }
        return null;
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

        playerBaseDoorX = new int[LEVEL_AMOUNT];
        playerBaseDoorY = new int[LEVEL_AMOUNT];


        actionAmount[0] = 12;

        playerBaseX[0] = 3;
        playerBaseY[0] = 2;

        playerBaseDoorX[0] =4;
        playerBaseDoorY[0] =4;

        enemyBaseX[0] = 30;
        enemyBaseY[0] = 1;

        enemyAmount[0] = 6;

        enemySpawnX[0] = 31;
        enemySpawnY[0] = 3;


        actionAmount[1] = 12;

        playerBaseX[1] = 1;
        playerBaseY[1] = 13;

        playerBaseDoorX[1] =2;
        playerBaseDoorY[1] =15;

        enemyBaseX[1] = 30;
        enemyBaseY[1] = 1;

        enemyAmount[1] = 9;

        enemySpawnX[1] = 31;
        enemySpawnY[1] = 3;


        actionAmount[2] = 22;

        playerBaseX[2] = 2;
        playerBaseY[2] = 4;

        playerBaseDoorX[2] =3;
        playerBaseDoorY[2] =6;

        enemyBaseX[2] = 30;
        enemyBaseY[2] = 1;

        enemyAmount[2] = 11;

        enemySpawnX[2] = 31;
        enemySpawnY[2] = 3;

    }


    public static Action whatNext(Level currentLevel, int actionCounter) {

        switch (currentLevel) {
            case LEVEL1:
                return levelOneFlow(actionCounter);
            case LEVEL2:
                return levelTwoFlow(actionCounter);
            case LEVEL3:
                return levelThreeFlow(actionCounter);
        }
        return null;
    }


    private static Action levelOneFlow(int actionCounter) {

        if (actionCounter % 2 == 0) {

            return Action.CREATE_ENEMY;
        }
        else {
            return Action.DO_NOTHING;
        }

        /*switch (actionCounter) {
            case 0:
                return Action.DO_NOTHING;
            case 1:
                return Action.DO_NOTHING;
            case 2:
                return Action.CREATE_ENEMY;
            case 3:
                return Action.CREATE_ENEMY;
            case 4:
                return Action.DO_NOTHING;
            case 5:
                return Action.CREATE_ENEMY;
            case 6:
                return Action.CREATE_ENEMY;
            case 7:
                return Action.DO_NOTHING;
            case 8:
                return Action.CREATE_ENEMY;
            case 9:
                return Action.CREATE_ENEMY;
        }
        return null;*/
    }

    private static Action levelTwoFlow(int actionCounter) {

        switch (actionCounter) {
            case 0:
                return Action.DO_NOTHING;
            case 1:
                return Action.CREATE_ENEMY;
            case 2:
                return Action.CREATE_ENEMY;
            case 3:
                return Action.CREATE_ENEMY;
            case 4:
                return Action.DO_NOTHING;
            case 5:
                return Action.CREATE_ENEMY;
            case 6:
                return Action.CREATE_ENEMY;
            case 7:
                return Action.CREATE_ENEMY;
            case 8:
                return Action.DO_NOTHING;
            case 9:
                return Action.CREATE_ENEMY;
            case 10:
                return Action.CREATE_ENEMY;
            case 11:
                return Action.CREATE_ENEMY;

        }
        return null;
    }

    private static Action levelThreeFlow(int actionCounter) {

        if (actionCounter % 2 == 0) {

            return Action.CREATE_ENEMY;
        } else {
            return Action.DO_NOTHING;
        }
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

    public static int getPlayerBaseDoorX(Level currentLevel) {
        return playerBaseDoorX[currentLevel.getLevelId()];
    }

    public static int getPlayerBaseDoorY(Level currentLevel) {
        return playerBaseDoorY[currentLevel.getLevelId()];
    }
}
