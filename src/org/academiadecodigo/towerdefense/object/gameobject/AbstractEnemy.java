package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.towerdefense.object.representable.MovableRepresentable;

/**
 * Created by codecadet on 23/05/16.
 */
public abstract class AbstractEnemy extends AbstractMovableObject {
    Direction dir;

    public AbstractEnemy(MovableRepresentable representation, GameObjectType type, int xPos, int yPos) {
        super(representation, type, xPos, yPos);


    }

    public void walk(boolean isFrontPath, boolean isLeftPath, boolean isRightPath) {
        switch (dir) {

            case NORTH:
                if (isFrontPath) {
                    move(0, -1);
                }

                if (isLeftPath) {
                    move(-1, 0);
                    dir = Direction.WEST;
                }

                if (isRightPath) {
                    move(0, 1);
                    dir = Direction.EAST;
                }
                break;

            case SOUTH:
                if (isFrontPath) {
                    move(0, 1);
                }

                if (isLeftPath) {
                    move(1, 0);
                    dir = Direction.EAST;
                }

                if (isRightPath) {
                    move(-1, 0);
                    dir = Direction.WEST;
                }
                break;

            case EAST:
                if (isFrontPath) {
                    move(1, 0);
                }

                if (isLeftPath) {
                    move(0, -1);
                    dir = Direction.NORTH;
                }

                if (isRightPath) {
                    move(0, 1);
                    dir = Direction.SOUTH;
                }
                break;

            case WEST:
                if (isFrontPath) {
                    move(-1, 0);
                }

                if (isLeftPath) {
                    move(0, 1);
                    dir = Direction.SOUTH;
                }

                if (isRightPath) {
                    move(0, -1);
                    dir = Direction.NORTH;
                }
                break;

            default:
                if (isFrontPath) {
                    move(0, -1);
                    dir = Direction.NORTH;
                    break;
                }

                if (isLeftPath) {
                    move(-1, 0);
                    dir = Direction.WEST;
                    break;
                }

                if (isRightPath) {
                    move(0, 1);
                    dir = Direction.EAST;
                    break;
                }

                move(0, 1);
                dir = Direction.SOUTH;
        }
    }
}
