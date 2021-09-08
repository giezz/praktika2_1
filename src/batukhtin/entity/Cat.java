package batukhtin.entity;

import batukhtin.interfaces.Jump;
import batukhtin.interfaces.Run;

/**
 * Created by class on 08.09.2021.
 */
public class Cat implements Jump, Run {

    int maxJumpHeight = 10;
    int maxRunDistance = 100;

    public void run(int distance) {
        if (distance < maxRunDistance && distance > 0) System.out.println("cat ran " + distance);
        else System.out.println("cat can't run " + distance);
    }

    public void jump(int height) {
        if (height < maxJumpHeight && height > 0)System.out.println("cat jumped " + height);
        else System.out.println("cat can't jump " + height);
    }
}
