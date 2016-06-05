package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 05/06/16.
 */
public class SimpleGfxEndGameScreen extends SimpleGfxRepresentation{


    public SimpleGfxEndGameScreen(int xPos, int yPos) {
        super(new Picture(360, 150, "resources/Victory.png"), xPos, yPos);
    }

    public void isDefeat() {

        ((Picture)getShape()).load("resources/Defeat.png");
    }

}
