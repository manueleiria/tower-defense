package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Created by codecadet on 04/06/16.
 */
public class SimpleGfxMenu extends SimpleGfxRepresentation {

    private SimpleGfxButton buttonLevel1;
    private SimpleGfxButton buttonLevel2;
    private int button1X = 550;
    private int button1Y = 240;
    private int button2X = 550;
    private int button2Y = 275;
    private int buttonSizeX = 80;
    private int buttonSizeY = 35;

    public SimpleGfxMenu(int xPos, int yPos) {
        super(new Picture(getMarginLeft(), getMarginTop(), "resources/menu/menuBackground.jpg"), xPos, yPos);
    }


    public void init() {

        super.getShape().draw();
        buttonLevel1 = new SimpleGfxButton(button1X, button1Y, "resources/menu/buttonLevel1.png");
        buttonLevel2 = new SimpleGfxButton(button2X, button2Y, "resources/menu/buttonLevel2.png");
    }

}
