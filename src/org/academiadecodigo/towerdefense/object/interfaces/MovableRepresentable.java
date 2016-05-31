package org.academiadecodigo.towerdefense.object.interfaces;

/**
 * Created by codecadet on 23/05/16.
 */
public interface MovableRepresentable extends Representable {

    void animate(int animCounter);


    void move(int dy);


    void move(int dx, int dy);
}
