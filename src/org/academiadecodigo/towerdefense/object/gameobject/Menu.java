package org.academiadecodigo.towerdefense.object.gameobject;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.towerdefense.Level;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxRepresentation;

/**
 * Created by codecadet on 04/06/16.
 */
public class Menu extends AbstractObject implements MouseHandler {

    private Mouse mouse;
    private Button buttonLevel1;
    private Button buttonLevel2;
    private Button buttonLevel3;
    private Button buttonExit;

    private int button1X = 550;
    private int button1Y = 240;
    private int button2X = 550;
    private int button2Y = 275;
    private int button3X = 550;
    private int button3Y = 310;
    private int buttonExitX = 550;
    private int buttonExitY = 365;
    private int buttonSizeX = 80;
    private int buttonSizeY = 35;
    private boolean isPlay = false;
    private int levelPlay;
    private Level level;
    private ObjectFactory factory;



    public Menu(Representable representation, int xPos, int yPos, ObjectFactory factory) {

        super(representation, GameObjectType.MENU, xPos, yPos);
        this.factory = factory;

    }

    public void init() {

        mouse = new Mouse(this);
        buttonLevel1 = (Button)factory.createButton(button1X, button1Y, "resources/menu/buttonLevel1.png");
        buttonLevel2 = (Button)factory.createButton(button2X, button2Y, "resources/menu/buttonLevel2.png");
        buttonLevel3 = (Button)factory.createButton(button3X, button3Y, "resources/menu/buttonLevel3.png");
        buttonExit = (Button)factory.createButton(buttonExitX, buttonExitY, "resources/menu/buttonExit.png");

    }

    public void clear() {
        getRepresentation().clear();
        buttonLevel1.getRepresentation().clear();
        buttonLevel2.getRepresentation().clear();
        buttonLevel3.getRepresentation().clear();
        buttonExit.getRepresentation().clear();


    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (isPlay) {
            return;
        }
        else {

            if ((mouseEvent.getX() > button1X && mouseEvent.getX() < button1X + buttonSizeX) &&
                    ((mouseEvent.getY() - 25) < button1Y + buttonSizeY && (mouseEvent.getY() - 25) > button1Y)) {

                isPlay = true;
                levelPlay = 0;
                level = levelChosen(levelPlay);
            }

            if ((mouseEvent.getX() > button2X && mouseEvent.getX() < button2X + buttonSizeX) &&
                    ((mouseEvent.getY() - 25) < button2Y + buttonSizeY && (mouseEvent.getY() - 25) > button2Y)) {

                isPlay = true;
                levelPlay = 1;
                level = levelChosen(levelPlay);
            }

            if ((mouseEvent.getX() > button3X && mouseEvent.getX() < button3X + buttonSizeX) &&
                    ((mouseEvent.getY() - 25) < button3Y + buttonSizeY && (mouseEvent.getY() - 25) > button3Y)) {

                isPlay = true;
                levelPlay = 2;
                level = levelChosen(levelPlay);
            }

            if ((mouseEvent.getX() > button3X && mouseEvent.getX() < button3X + buttonSizeX) &&
                    ((mouseEvent.getY() - 25) < button3Y + buttonSizeY && (mouseEvent.getY() - 25) > button3Y)) {

                isPlay = true;
                levelPlay = 2;
                level = levelChosen(levelPlay);
            }

            if ((mouseEvent.getX() > buttonExitX && mouseEvent.getX() < buttonExitX + buttonSizeX) &&
                    ((mouseEvent.getY() - 25) < buttonExitY + buttonSizeY && (mouseEvent.getY() - 25) > buttonExitY)) {

                System.exit(0);

            }

        }
    }

    public boolean isPlay() {
        return isPlay;
    }

    public Level getLevel() {
        return level;
    }

    public Level levelChosen(int level) {

        switch(level) {
            case 0:
                return Level.LEVEL1;
            case 1:
                return Level.LEVEL2;
            case 2:
                return Level.LEVEL3;
        }
        return null;
    }

}
