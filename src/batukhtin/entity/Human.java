package batukhtin.entity;

import batukhtin.interfaces.Entity;

/**
 * Created by class on 08.09.2021.
 */
public class Human implements Entity {

    public int maxJumpHeight = 20;
    public int maxRunDistance = 300;

    public boolean run(int distance) {
        if (distance < maxRunDistance && distance > 0) {
            System.out.println("human ran " + distance);
            return true;
        }
        else {
            System.out.println("human can't run " + distance);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height < maxJumpHeight && height > 0) {
            System.out.println("human jumped " + height);
            return true;
        }
        else {
            System.out.println("human can't jump " + height);
            return false;
        }
    }
}
