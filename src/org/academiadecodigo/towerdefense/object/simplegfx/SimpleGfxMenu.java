package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Created by codecadet on 04/06/16.
 */
public class SimpleGfxMenu extends SimpleGfxRepresentation {

    public SimpleGfxMenu(int xPos, int yPos) {
        super(new Picture(getMarginLeft(), getMarginTop(), "resources/menu/menuBackground.jpg"), xPos, yPos);
    }


}
