package org.academiadecodigo.xenon.world.gameobjects;



import org.academiadecodigo.xenon.world.GameMap;
import org.academiadecodigo.xenon.world.Drawable;
import org.academiadecodigo.xenon.world.Direction;

public abstract class GameObject implements Drawable, Movable, Destroyable {

    private GameMap gameMap;
    private Direction direction;

    private int x;
    private int y;

    private int width = 10;
    private int height = 10;

    private Rectangle rect;

    public GameObject(int x, int y, GameMap gameMap) {
        this.rect = new Rectangle(x, y, this.width, this.height);
        this.gameMap = gameMap;
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
            if (!this.gameMap.isInBounds(this.x - 10,
                                         this.y,
                                         this.width,
                                         this.height)) {
                return;
            }

            this.x -= 10;
            this.rect.translate(-10, 0);
            this.direction = null;
            break;
        case RIGHT:
            if (!this.gameMap.isInBounds(this.x + 10,
                                         this.y,
                                         this.width,
                                         this.height)) {
                return;
            }

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
