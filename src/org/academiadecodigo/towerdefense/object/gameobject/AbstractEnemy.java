package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.object.interfaces.MovableRepresentable;
import org.academiadecodigo.towerdefense.object.interfaces.Shootable;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxRepresentation;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractEnemy extends AbstractMovableObject implements Shootable, MouseHandler {
    private Direction dir;
    private int hitPoints = 10;
    private boolean isAlive = true;
    private ScoreBoard scoreBoard;


    public AbstractEnemy(MovableRepresentable representation, GameObjectType type, int xPos, int yPos, ScoreBoard scoreBoard) {
        super(representation, type, xPos, yPos);
        dir = Direction.STOPPED;
        this.scoreBoard = scoreBoard;
    }


    @Override
    public void animate(int animCounter) {
        //super.animate(animCounter);

        switch (dir) {

            case NORTH:
                moveRepresentable(0, -1);
                break;

            case SOUTH:
                moveRepresentable(0, 1);
                break;

            case WEST:
                moveRepresentable(-1, 0);
                break;

            case EAST:
                moveRepresentable(1, 0);
                break;

            case STOPPED:
                moveRepresentable(0, 0);
                break;
        }
    }


    public void move() {
        switch (dir) {

            case NORTH:
                super.move(0, -1);
                System.out.println(dir);
                break;

            case SOUTH:
                super.move(0, 1);
                System.out.println(dir);

                break;

            case WEST:
                super.move(-1, 0);
                System.out.println(dir);

                break;

            case EAST:
                super.move(1, 0);
                System.out.println(dir);

                break;

            case STOPPED:
                break;
        }
    }




    public void initialDirection(boolean northCheck, boolean southCheck, boolean westCheck, boolean eastCheck) {
        if (northCheck) ((MovableRepresentable)getRepresentation()).changeAnim(dir = Direction.NORTH);
        if (southCheck) ((MovableRepresentable)getRepresentation()).changeAnim(dir = Direction.SOUTH);
        if (westCheck) ((MovableRepresentable)getRepresentation()).changeAnim(dir = Direction.WEST);
        if (eastCheck) ((MovableRepresentable)getRepresentation()).changeAnim(dir = Direction.EAST);
    }


    public void verifyDirection(boolean northCheck, boolean southCheck, boolean westCheck, boolean eastCheck) {
        switch (dir) {

            case NORTH:
                changeDirection(northCheck, westCheck, eastCheck);
                break;

            case SOUTH:
                changeDirection(southCheck, eastCheck, westCheck);
                break;

            case WEST:
                changeDirection(westCheck, southCheck, northCheck);
                break;

            case EAST:
                changeDirection(eastCheck, northCheck, southCheck);
                break;

            default:
                break;
        }
    }


    private void changeDirection(boolean isFrontPath, boolean isLeftPath, boolean isRightPath) {
        switch (dir) {

            case NORTH:
                if (isFrontPath) {
                    return;
                }

                if (isLeftPath) {
                    dir = Direction.WEST;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }

                if (isRightPath) {
                    dir = Direction.EAST;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }
                break;

            case SOUTH:
                if (isFrontPath) {
                    return;
                }

                if (isLeftPath) {
                    dir = Direction.EAST;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }

                if (isRightPath) {
                    dir = Direction.WEST;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }
                break;

            case EAST:
                if (isFrontPath) {
                    return;
                }

                if (isLeftPath) {
                    dir = Direction.NORTH;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }

                if (isRightPath) {
                    dir = Direction.SOUTH;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }
                break;

            case WEST:
                if (isFrontPath) {
                    return;
                }

                if (isLeftPath) {
                    dir = Direction.SOUTH;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }

                if (isRightPath) {
                    dir = Direction.NORTH;
                    ((MovableRepresentable)getRepresentation()).changeAnim(dir);
                    return;
                }
                break;
        }

        dir = Direction.STOPPED;
        ((MovableRepresentable)getRepresentation()).changeAnim(dir);
    }



    @Override
    public int getHP() {
        return hitPoints;
    }

    @Override
    public void loseHP() {
        hitPoints -= 10;
        if (hitPoints <= 0) {
            setDead();
            dir = Direction.STOPPED;
            ((MovableRepresentable)getRepresentation()).changeAnim(dir);
            scoreBoard.increaseScore();
        }
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public boolean setDead() {
        return isAlive = false;
    }

    @Override
    public void setHP(int hp) {
        this.hitPoints = hp;
    }

    public Direction getDir() {
        return dir;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
