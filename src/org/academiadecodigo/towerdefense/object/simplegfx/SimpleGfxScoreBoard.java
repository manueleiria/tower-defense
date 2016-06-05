package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.towerdefense.object.gameobject.ScoreBoard;
import org.academiadecodigo.towerdefense.object.interfaces.ScoreboardRepresentable;

/**
 * Created by codecadet on 05/06/16.
 */
public class SimpleGfxScoreBoard extends SimpleGfxRepresentation implements ScoreboardRepresentable {

    private Text score;
    private int currentScore;

    public SimpleGfxScoreBoard(int xPos, int yPos) {
        super(new Picture(xPos, yPos, "resources/scoreboard.png"), xPos, yPos);
        score = new Text(1075, 605, "x " + 0);
    }


    @Override
    public void increaseScore(int currentScore) {
        score.delete();
        score = new Text(1075, 605, "x " + (currentScore += 100));
        this.currentScore = currentScore;
        score.draw();
    }

    public int getCurrentScore() {
        return currentScore;
    }
}
