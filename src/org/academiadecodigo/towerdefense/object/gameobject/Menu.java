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
    private int button1X = 550;
    private int button1Y = 240;
    private int button2X = 550;
    private int button2Y = 275;
    private int buttonSizeX = 80;
    private int buttonSizeY = 35;
    private boolean isPlay = false;
    private int levelPlay;
    private Level level;

    private Representable buttonLevel1;
    private Representable buttonLevel2;


    public Menu(Representable representation, int xPos, int yPos) {

        super(representation, GameObjectType.MENU, xPos, yPos);

    }

    public void init() {

    }

    public void clear() {

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
                //return null;
                break;
            default:
        }
        return null;
    }
}
