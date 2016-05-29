package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.*;

/**
 * Created by codecadet on 23/05/16.
 */
public class Game {
    private static final int DELAY = 20;
    private ObjectFactory factory;
    private Level currentLevel;
    private Field field;
    private PlayerBase playerBase;
    private EnemyBase enemyBase;
    private AbstractEnemy[] enemies;


    public Game(ObjectFactory factory, Level currentLevel) {

        this.currentLevel = currentLevel;
        this.factory = factory;
        init();

    }

    public void init() {
        LevelFlow.init();

        field = (Field) factory.createObject(GameObjectType.FIELD, 0, 0);
        boolean[][] path = LevelFlow.drawPath(currentLevel);
        field.setTileMap(path);

        playerBase = (PlayerBase) factory.createObject(GameObjectType.PLAYER_BASE, LevelFlow.getPlayerBaseX(currentLevel), LevelFlow.getPlayerBaseY(currentLevel));
        enemyBase = (EnemyBase) factory.createObject(GameObjectType.ENEMY_BASE, LevelFlow.getEnemyBaseX(currentLevel), LevelFlow.getEnemyBaseY(currentLevel));
        enemies = new AbstractEnemy[LevelFlow.getEnemyAmount(currentLevel)];

        field.init();

    }

    /**@throws InterruptedException*/
    public void start() throws InterruptedException {
        Action currentAction;
        int animCounter = 0;
        int actionCounter = 0;

        while (true) {
            Thread.sleep(DELAY);

            animCounter++;

            if (animCounter == 32) {

                doMovement();

                if (actionCounter < LevelFlow.getActionAmount(currentLevel)) {
                    currentAction = LevelFlow.doNext(currentLevel, actionCounter);
                    doAction(currentAction);
                }
                System.out.println(actionCounter);

                actionCounter++;
                animCounter = 0;
            }

            animateAll(animCounter);
        }
    }

    private void animateAll(int animCounter) {
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i] != null) {
                enemies[i].animate(animCounter);
            }
        }
    }

    private void doMovement() {
        System.out.println(field.getTileMap()[6][10]);
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i] != null) {
                System.out.println(field.getTileMap()[enemies[0].getxPos() - 1][enemies[0].getyPos()]);
                System.out.println(enemies[0].getxPos() + " " + enemies[0].getyPos());
                enemies[i].move();
                enemies[i].verifyDirection(
                        field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() - 1],
                        field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() + 1],
                        field.getTileMap()[enemies[i].getxPos() - 1][enemies[i].getyPos()],
                        field.getTileMap()[enemies[i].getxPos() + 1][enemies[i].getyPos()]);
            }
        }
    }

    private void doAction(Action currentAction) {
        switch (currentAction) {
            case DO_NOTHING:
                break;
            case CREATE_ENEMY:
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i] == null) {
                        enemies[i] = (AbstractEnemy) factory.createObject(GameObjectType.BASE_ENEMY, LevelFlow.getEnemySpawnX(currentLevel), LevelFlow.getEnemySpawnY(currentLevel));
                        enemies[i].initialDirection(
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() - 1],
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() + 1],
                                field.getTileMap()[enemies[i].getxPos() - 1][enemies[i].getyPos()],
                                field.getTileMap()[enemies[i].getxPos() + 1][enemies[i].getyPos()]);
                        return;
                    }
                }
                break;
        }
    }
}
