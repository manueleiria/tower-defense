package org.academiadecodigo.towerdefense.object.gameobject.placeable;

import com.sun.deploy.model.ResourceProvider;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.towerdefense.object.gameobject.AbstractPlaceable;
import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.Projectile;
import org.academiadecodigo.towerdefense.object.gameobject.enemy.BaseEnemy;
import org.academiadecodigo.towerdefense.object.representable.Representable;

/**
 * Created by codecadet on 23/05/16.
 */
public class Tower extends AbstractPlaceable {

    private int posX, posY;

    private int numbTowers;
    private int cost;

    private Projectile projectile;
    private int range;
    private GameObjectType type;
    private int damage;

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public Tower(Representable representation, int posX, int posY, int damage) {
        super(representation);
        this.posX = posX;
        this.posY = posY;
        this.damage = damage;
        this.type = GameObjectType.TOWER;


    }

    /*public void drawTower(){



    }*/

    public void shoot(BaseEnemy enemy){


    }

    public void inRange(BaseEnemy enemy){



        shoot(enemy);

    }


}

