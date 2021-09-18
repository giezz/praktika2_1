package batukhtin.entity;

import batukhtin.interfaces.Obstacle;

/**
 * Created by class on 08.09.2021.
 */
public class Track implements Obstacle {

    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getSize() {
        return trackLength;
    }
}
