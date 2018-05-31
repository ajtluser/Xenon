package org.academiadecodigo.xenon.world.gameobjects;

public enum SpaceShipType {

    PLAYER(57, 61, "res/playerShip.png"),
    ENEMY(60, 70, "res/enemyShip.png");


    private int width;
    private int height;
    private String path;

    SpaceShipType(int width, int height, String path) {
        this.width = width;
        this.height = height;
        this.path = path;

    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return height;
    }

    public String getPath() {
        return path;
    }
}
