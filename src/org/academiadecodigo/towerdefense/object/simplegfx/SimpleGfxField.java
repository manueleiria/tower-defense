package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.PlayerBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxField extends SimpleGfxRepresentation {

    //Map size
    private static final int MARGIN_LEFT = 10;
    private static final int MARGIN_TOP = 10;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private boolean[][] path = new boolean[WIDTH][HEIGHT];


    public SimpleGfxField() {

        super(new Rectangle(MARGIN_LEFT, MARGIN_TOP, WIDTH, HEIGHT));
        //calcPath(x,y);
    }

    // Create a Path from actual pos(x,y) to PLAYER_BASE

    public int calcPath(int x, int y) {

        int destinoX = 100; //SimpleGfxPlayerBase(getX());
        int destinoY = 250; //SimpleGfxPlayerBase(getY());

        path[x][y] = true;

        if ( x == destinoX && y == destinoY) {
            return 0; //work on this
        }
        getValidPos(x,y);

        return calcPath(x,y);
    }

    public int getValidPos(int x, int y) {
        int right = x+1;
        int left = x-1;
        int up = y+1;
        int down = y-1;

        if (x >= WIDTH) {
            return -1;
        }

        if (y >= HEIGHT) {
            return -1;
        }

        if (path[x][y]) {
            return -1;
        }

        int possible = (int) (Math.random() * 4);

        if (possible == 0) {
            return right;
        }
        else if (possible == 1){
            return left;
        }
        else if (possible == 2) {
            return up;
        }
        else {
            return down;
        }
    }
}

