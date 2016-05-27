package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class PlayerBase extends AbstractObject implements MouseHandler{

    private int hitPoints = 100;
    private Mouse mouse;
    private int mouseX;
    private int mouseY;



    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }




    public PlayerBase(Representable representation, int xPos, int yPos) {

<<<<<<< HEAD
        super(representation, GameObjectType.PLAYER_BASE);
        mouse = new Mouse(this);

=======
        super(representation, GameObjectType.PLAYER_BASE, xPos, yPos);
>>>>>>> master
    }






    public int decreaseHitPoints(int damage) {
        return hitPoints -= damage;
    }


    // TODO: implement shoot interface





    @Override
    public void mouseClicked(MouseEvent mouseEvent) {




        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {


        //confirmar posição
        mouse.addEventListener(MouseEventType.MOUSE_MOVED);

    }


}
