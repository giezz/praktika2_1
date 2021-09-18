package batukhtin.entity;

import batukhtin.interfaces.Entity;

/**
 * Created by class on 08.09.2021.
 */
public class Cat implements Entity {

    public int maxJumpHeight = 10;
    public int maxRunDistance = 100;

    public boolean run(int distance) {
        if (distance < maxRunDistance && distance > 0) {
            System.out.println("cat ran " + distance);
            return true;
        }
        else {
            System.out.println("cat can't run " + distance);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height < maxJumpHeight && height > 0) {
            System.out.println("cat jumped " + height);
            return true;
        }
        else {
            System.out.println("cat can't jump " + height);
            return false;
        }
    }
}
