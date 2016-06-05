package org.academiadecodigo.towerdefense.object.simplegfx;


import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.towerdefense.object.gameobject.Direction;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxEnemy extends SimpleGfxMovableRepresentation {


    public SimpleGfxEnemy(GameObjectType type, int xPos, int yPos) {
        super(new Picture(xPos*getCellSize() + getMarginLeft(), yPos*getCellSize() + getMarginTop(), "resources/enemies/base_enemy/enemyDown.png"), xPos, yPos);

    }

    @Override
    public void changeAnim(Direction dir) {
        super.changeAnim(dir);
        switch (this.getDir()) {
            case NORTH:
                ((Picture) getShape()).load("resources/enemies/base_enemy/enemyUp.png");
                System.out.println(dir);
                break;

            case EAST:
                ((Picture) getShape()).load("resources/enemies/base_enemy/enemyRight.png");
                System.out.println(dir);
                break;

            case WEST:
                ((Picture) getShape()).load("resources/enemies/base_enemy/enemyLeft.png");
                System.out.println(dir);
                break;

            case SOUTH:
                ((Picture) getShape()).load("resources/enemies/base_enemy/enemyDown.png");
                System.out.println(dir);
                break;

            case STOPPED:
                ((Picture) getShape()).load("resources/enemies/base_enemy/enemyDead.png");
                System.out.println(dir);
                break;

        }
    }

    public void move(int dy) {

        if (getShape() instanceof Movable) {

            ((Movable) getShape()).translate(0, dy);
        }
    }


    public void move(int dx, int dy) {

        if (getShape() != null && getShape() instanceof Movable) {

            ((Movable) getShape()).translate(dx, dy);
        }
    }

}
