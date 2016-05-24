package org.academiadecodigo.towerdefense.object.representable;

/**
 * Created by codecadet on 23/05/16.
 */
public interface MovableRepresentable extends Representable {


    void move(int dy);


    void move(int dx, int dy);
}
