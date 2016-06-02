package org.academiadecodigo.towerdefense.object.interfaces;

/**
 * Created by codecadet on 30/05/16.
 */
public interface Shootable {

    public int getHP();

    public void loseHP();

    public boolean isAlive();

    public boolean setDead();

    public void setHP(int hp);

}
