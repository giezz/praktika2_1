package batukhtin.entity;

import batukhtin.interfaces.Obstacle;

/**
 * Created by class on 08.09.2021.
 */
public class Wall implements Obstacle {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getSize() {
        return wallHeight;
    }

}
