package org.academiadecodigo.towerdefense.object.gameobject;

/**
 * Created by codecadet on 23/05/16.
 */
public enum GameObjectType {
    FIELD(35, 20),
    PLAYER_BASE(3, 3),
    ENEMY_BASE(3, 3),
    PROJECTILE(1, 1),
    TOWER(2, 2),
    BASE_ENEMY(3, 3);

    private int cols;
    private int rows;

    GameObjectType(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
