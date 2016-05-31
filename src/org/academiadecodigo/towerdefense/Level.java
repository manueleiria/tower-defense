package org.academiadecodigo.towerdefense;

/**
 * Created by <vi.KING_> Ralfe Elias on 27/05/16.
 */
public enum Level {
    LEVEL1 (0);

    private int levelId;

    Level(int levelId) {
        this.levelId = levelId;
    }

    public int getLevelId() {
        return levelId;
    }
}
