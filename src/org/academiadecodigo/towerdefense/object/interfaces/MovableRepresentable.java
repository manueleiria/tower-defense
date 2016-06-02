package org.academiadecodigo.towerdefense.object.interfaces;

import org.academiadecodigo.towerdefense.object.gameobject.Direction;

/**
 * Created by codecadet on 23/05/16.
 */
public interface MovableRepresentable extends Representable {

    void animate(int animCounter);


    void move(int dy);

    void changeAnim(Direction dir);


    void move(int dx, int dy);
}
