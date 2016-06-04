package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 04/06/16.
 */
public class SimpleGfxButton extends SimpleGfxRepresentation {


    public SimpleGfxButton(int xPos, int yPos, String path) {

        super(new Picture(xPos, yPos, path), xPos, yPos);
    }
}
