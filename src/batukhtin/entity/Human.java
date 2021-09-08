package batukhtin.entity;

import batukhtin.interfaces.Jump;
import batukhtin.interfaces.Run;

/**
 * Created by class on 08.09.2021.
 */
public class Human implements Jump, Run {

    int maxJumpHeight = 20;
    int maxRunDistance = 300;

    public void run(int distance) {
        if (distance < maxRunDistance && distance > 0) System.out.println("human ran " + distance);
        else System.out.println("human can't run " + distance);
    }

    public void jump(int height) {
        if (height < maxJumpHeight && height > 0)System.out.println("human jumped " + height);
        else System.out.println("human can't jump " + height);
    }
}
