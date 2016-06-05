package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxEndGameScreen;

/**
 * Created by codecadet on 05/06/16.
 */
public class EndGameScreen extends AbstractObject implements MouseHandler{

    private int tryAgainX = 440;
    private int tryAgainY = 500;
    private int tryAgainSizeX = 200;
    private int tryAgainSizeY = 50;
    private Button tryAgain;
    private Mouse mouse;
    private boolean newTry = false;
    private ObjectFactory factory;


    public EndGameScreen(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.END_GAME_SCREEN, xPos, yPos);
        mouse = new Mouse(this);
    }

    public void init(ObjectFactory factory){
        this.factory = factory;
        factory.createButton(tryAgainX, tryAgainY, "resources/tryAgain.png");

    }
    public void ifDefeat() {

        ((SimpleGfxEndGameScreen)getRepresentation()).isDefeat();
        //tryAgain =
    }

    public void ifVictory() {

        //tryAgain
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if ((mouseEvent.getX() > tryAgainX && mouseEvent.getX() < tryAgainX + tryAgainSizeX) &&
                ((mouseEvent.getY() - 25) < tryAgainY + tryAgainSizeY && (mouseEvent.getY() - 25) > tryAgainSizeY)) {

            System.out.println("Try again!");
            newTry = true;

        }

    }

    public boolean isNewTry() {
        return newTry;
    }
}
