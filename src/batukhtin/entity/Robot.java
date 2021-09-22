package batukhtin.entity;

import batukhtin.interfaces.Entity;
import batukhtin.interfaces.SuperJump;

/**
 * Created by class on 08.09.2021.
 */
public class Robot implements Entity, SuperJump {

    private final int maxJumpHeight = 100;
    private final int maxRunDistance = 500;

    public boolean run(int distance) {
        if (distance < maxRunDistance && distance > 0) {
            System.out.println("robot ran " + distance);
            return true;
        }
        else {
            System.out.println("robot can't run " + distance);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height < maxJumpHeight && height > 0) {
            System.out.println("robot jumped " + height);
            return true;
        }
        else {
            System.out.println("robot can't jump " + height);
            return false;
        }
    }

    public void superJump(int height) {
        System.out.println("robot superjumped through " + height);
    }
}
