package org.academiadecodigo.towerdefense.object.gameobject;

/**
 * Created by codecadet on 29/05/16.
 */
public enum TileType {
    GRASS("grass", false, true),
    ROAD("road", true, false),
    TREE("tree", false, false);

    String texDir;
    boolean isWalkable;
    boolean isBuildable;

    TileType(String texDir, boolean isWalkable, boolean isBuildable) {
        this.texDir = texDir;
        this.isWalkable = isWalkable;
        this.isBuildable = isBuildable;
    }

    public String getTexDir() {
        return texDir;
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public boolean isBuildable() {
        return isBuildable;
    }
}
