package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.towerdefense.object.gameobject.enemy.BaseEnemy;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 27/05/16.
 */
public class SimpleGfxTower extends SimpleGfxPlaceableRepresentable {

    private static final int WIDTH = 30;
    private static final int HEIGHT = 30;

    public SimpleGfxTower(Representable representation, int posX, int posY, int damage) {
        super(representation, posX, posY, damage);
    }

    /*@Override
    public void drawTower(){

    }*/

    @Override
    public  void shoot(BaseEnemy enemy) {



    }

    @Override
    public void inRange(BaseEnemy enemy){

       shoot(enemy);

    }




}
