package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.*;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxScoreBoard;

/**
 * Created by codecadet on 23/05/16.
 */
public class Game {

    private static final int DELAY = 10;
    private ObjectFactory factory;
    private Level currentLevel;
    private Field field;
    private ScoreBoard scoreBoard;
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
        field.init(factory, LevelFlow.drawMap(currentLevel));

        playerBase = (PlayerBase) factory.createObject(
                GameObjectType.PLAYER_BASE,
                LevelFlow.getPlayerBaseX(currentLevel),
                LevelFlow.getPlayerBaseY(currentLevel));

        enemyBase = (EnemyBase) factory.createObject(
                GameObjectType.ENEMY_BASE,
                LevelFlow.getEnemyBaseX(currentLevel),
                LevelFlow.getEnemyBaseY(currentLevel));

        //scoreBoard = (ScoreBoard) factory.createObject(GameObjectType.SCOREBOARD, 1020, 580);
        SimpleGfxScoreBoard scoreBoard = new SimpleGfxScoreBoard(1020, 580);
        scoreBoard.currentScore(currentLevel);

        enemies = new AbstractEnemy[LevelFlow.getEnemyAmount(currentLevel)];
    }


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

                    currentAction = LevelFlow.whatNext(currentLevel, actionCounter);
                    doAction(currentAction);
                }

                animCounter = 0;
                actionCounter++;
            }

            animateAll(animCounter);
        }
    }


    private void doAction(Action currentAction) {

        switch (currentAction) {

            case DO_NOTHING:
                break;

            case CREATE_ENEMY:
                for (int i = 0; i < enemies.length; i++) {

                    if (enemies[i] == null) {

                        enemies[i] = (AbstractEnemy) factory.createObject(
                                GameObjectType.BASE_ENEMY,
                                LevelFlow.getEnemySpawnX(currentLevel),
                                LevelFlow.getEnemySpawnY(currentLevel));

                        enemies[i].initialDirection(
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() - 1].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() + 1].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos() - 1][enemies[i].getyPos()].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos() + 1][enemies[i].getyPos()].getTileType().isWalkable());

                        return;
                    }
                }
                break;
        }
    }


    private void doMovement() {

        for (int i = 0; i < enemies.length; i++) {

            if (enemies[i] != null) {

                enemies[i].move();

                enemies[i].verifyDirection(
                        field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() - 1].getTileType().isWalkable(),
                        field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() + 1].getTileType().isWalkable(),
                        field.getTileMap()[enemies[i].getxPos() - 1][enemies[i].getyPos()].getTileType().isWalkable(),
                        field.getTileMap()[enemies[i].getxPos() + 1][enemies[i].getyPos()].getTileType().isWalkable());
            }
        }
    }


    private void animateAll(int animCounter) {

        for (int i = 0; i < enemies.length; i++) {

            if (enemies[i] != null) {

                enemies[i].animate(animCounter);
            }
        }
    }
}
