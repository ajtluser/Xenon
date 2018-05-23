package org.academiadecodigo.xenon.world.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import org.academiadecodigo.xenon.world.Drawable;
import org.academiadecodigo.xenon.world.Direction;

public abstract class GameObject implements Drawable, Movable, Destroyable {

    private Direction direction;

    private int x;
    private int y;

    private int width = 20;
    private int height = 20;

    private Rectangle rect;

    public GameObject(int x, int y) {
        this.rect = new Rectangle(x, y, this.width, this.height);
    }

    public void show() {
        this.rect.fill();
    }

    public void hide() {
    }

    public void tick() {
        if (this.direction == null) {
            return;
        }

        switch (this.direction) {
        case LEFT:
            this.x -= 10;
            this.rect.translate(-10, 0);
            this.direction = null;
            break;
        case RIGHT:
            this.x += 10;
            this.rect.translate(10, 0);
            this.direction = null;
            break;
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getHeading() {
        return null;
    }

    public void destroy() {
    }

    public boolean isDestroyed() {
        return false;
    }

    public boolean overlaps(GameObject gameObject) {
        return false;
    }
}
