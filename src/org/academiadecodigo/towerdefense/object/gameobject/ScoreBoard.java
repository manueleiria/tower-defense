package org.academiadecodigo.towerdefense.object.gameobject;


import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.towerdefense.object.interfaces.ScoreboardRepresentable;

/**
 * Created by codecadet on 05/06/16.
 */
public class ScoreBoard extends AbstractObject {

    private Representable score;
    private Representable victory;
    private Representable defeat;
    private int numberOfEnemies;
    private int currentScore;


    public ScoreBoard(Representable representation, int xPos, int yPos) {
        super(representation, GameObjectType.SCOREBOARD, xPos, yPos);
        currentScore = 0;

    }

    public void increaseScore() {
        ((ScoreboardRepresentable)getRepresentation()).increaseScore(currentScore);
        currentScore = ((ScoreboardRepresentable)getRepresentation()).getCurrentScore();
    }

    public int getCurrentScore() {
        return currentScore;
    }
}
