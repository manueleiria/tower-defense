package org.academiadecodigo.towerdefense;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.object.gameobject.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by codecadet on 23/05/16.
 */
public class Game implements MouseHandler {

    private static final int DELAY = 5;
    private ObjectFactory factory;
    private Level currentLevel;
    private Field field;
    private ScoreBoard scoreBoard;
    private EndGameScreen endGameScreen;
    private PlayerBase playerBase;
    private EnemyBase enemyBase;
    private AbstractEnemy[] enemies;
    private HashMap<Integer, AbstractEnemy> gameEnemies = new HashMap<>();
    private int createdEnemies;
    private Mouse mouse;
    private boolean gamecycle;


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

        scoreBoard = (ScoreBoard) factory.createObject(GameObjectType.SCOREBOARD, 1020, 580);
        factory.giveScoreBoard(scoreBoard);

        mouse = new Mouse(this);

        enemies = new AbstractEnemy[LevelFlow.getEnemyAmount(currentLevel)];

        for (int i = 0; i < enemies.length; i++) {
            gameEnemies.put(i, enemies[i]);
        }
    }


    public void start() throws InterruptedException {
        Action currentAction;
        int animCounter = 0;
        int actionCounter = 0;
        gamecycle = true;

        while (gamecycle) {
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

            checkVictory(currentLevel);
            checkDefeat(currentLevel);

            animateAll(animCounter);

            if (endGameScreen != null && endGameScreen.isNewTry()) {
                gamecycle = false;
                //calls menu
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

                        enemies[i] = (AbstractEnemy) factory.createObject(
                                GameObjectType.BASE_ENEMY,
                                LevelFlow.getEnemySpawnX(currentLevel),
                                LevelFlow.getEnemySpawnY(currentLevel));

                        enemies[i].initialDirection(
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() - 1].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos()][enemies[i].getyPos() + 1].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos() - 1][enemies[i].getyPos()].getTileType().isWalkable(),
                                field.getTileMap()[enemies[i].getxPos() + 1][enemies[i].getyPos()].getTileType().isWalkable());

                        createdEnemies++;

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

                if (enemies[i].getDir() != Direction.STOPPED) {
                    enemies[i].animate(animCounter);
                }
            }
        }
    }

    private void checkVictory(Level currentLevel) throws InterruptedException{

        if (endGameScreen == null) {
            if (scoreBoard.getCurrentScore() == (LevelFlow.getEnemyAmount(currentLevel) * 100)) {
                endGameScreen = (EndGameScreen) factory.createObject(GameObjectType.END_GAME_SCREEN, 11, 5);
                endGameScreen.init(factory);
            }
        }

    }

    private void checkDefeat(Level currentLevel) throws InterruptedException{

        Set entrySet = gameEnemies.entrySet();
        Iterator it = gameEnemies.entrySet().iterator();

        if (endGameScreen == null) {
            while (it.hasNext()) {
                HashMap.Entry me = (HashMap.Entry)it.next();
                if ((((AbstractEnemy)me.getValue()).getxPos() == LevelFlow.getPlayerBaseDoorX(currentLevel)) && (((AbstractEnemy)me.getValue()).getyPos() == LevelFlow.getPlayerBaseDoorY(currentLevel))) {
                    endGameScreen = (EndGameScreen) factory.createObject(GameObjectType.END_GAME_SCREEN, 11, 5);
                    endGameScreen.ifDefeat();
                    endGameScreen.init(factory);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        Set entrySet = gameEnemies.entrySet();
        Iterator it = gameEnemies.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry me = (HashMap.Entry)it.next();

            if (enemies != null) {

                System.out.println("Mouse -> Y: " + (mouseEvent.getY()-25) + " x: " + mouseEvent.getX());
                System.out.println("Repr -> Y " + ((AbstractEnemy)me).getRepresentation().getYPos() + " X: " + ((AbstractEnemy)me).getRepresentation().getXPos());

                if ((mouseEvent.getX() >((AbstractEnemy)me).getRepresentation().getXPos()   && mouseEvent.getX() < ((AbstractEnemy)me).getRepresentation().getXPos() +((AbstractEnemy)me).getRepresentation().getCellSizeG() ) &&
                        ((mouseEvent.getY() - 25) < ((AbstractEnemy)me).getRepresentation().getYPos() + ((AbstractEnemy)me).getRepresentation().getCellSizeG() && (mouseEvent.getY() - 25) > ((AbstractEnemy)me).getRepresentation().getYPos())) {

                    if (!((AbstractEnemy)me).isAlive()) {
                        System.out.println("Enemy is already dead!");
                    } else {
                        ((AbstractEnemy)me).loseHP();
                        System.out.println(((AbstractEnemy)me).getHitPoints());
                    }
                }

            }
        }
    }
}
