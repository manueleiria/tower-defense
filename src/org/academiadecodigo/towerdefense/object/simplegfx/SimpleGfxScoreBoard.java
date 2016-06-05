package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.towerdefense.Level;
import org.academiadecodigo.towerdefense.LevelFlow;

/**
 * Created by codecadet on 05/06/16.
 */
public class SimpleGfxScoreBoard extends SimpleGfxRepresentation{

    private Text score;

    public SimpleGfxScoreBoard(int xPos, int yPos) {
        super(new Picture(xPos, yPos, "resources/scoreboard.png"), xPos, yPos);
        score = new Text(1075, 605, "x ");
        score.draw();

    }

    public void currentScore(Level level) {
        score.delete();
        score = new Text(1075, 605, "x " + LevelFlow.getActionAmount(level) );
        score.draw();

    }
}
