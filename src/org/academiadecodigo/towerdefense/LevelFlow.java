package org.academiadecodigo.towerdefense;

import org.academiadecodigo.simplegraphics.graphics.Line;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public class LevelFlow {

    private Line path;
    private Level current;

    public void drawPath(int x, int y, int finalX, int finalY, Level current) {

        switch (current) {
            case LEVEL1:
                path = new Line(x, y, finalX, finalY);
                path.draw();
                break;
        }

    }
}
