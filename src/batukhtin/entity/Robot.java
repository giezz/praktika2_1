package batukhtin.entity;

import batukhtin.interfaces.Jump;
import batukhtin.interfaces.Run;

/**
 * Created by class on 08.09.2021.
 */
public class Robot implements Jump, Run {

    public int maxJumpHeight = 100;
    public int maxRunDistance = 500;

    public void run(int distance) {
        if (distance < maxRunDistance && distance > 0) System.out.println("robot ran " + distance);
        else System.out.println("robot can't run " + distance);
    }

    public void jump(int height) {
        if (height < maxJumpHeight && height > 0) System.out.println("robot jumped " + height);
        else System.out.println("robot can't jump " + height);
    }
}
