package batukhtin;

import batukhtin.entity.*;
import batukhtin.interfaces.Jump;
import batukhtin.interfaces.Run;

public class Main {

    public static void main(String[] args) {

        int[] barrier = new int[10];
        barrier[0] = new Wall(10).getWallHeight();
        barrier[1] = new Wall(20).getWallHeight();
        barrier[2] = new Wall(30).getWallHeight();
        barrier[3] = new Wall(40).getWallHeight();
        barrier[4] = new Wall(50).getWallHeight();
        barrier[5] = new Track(25).getTrackLength();
        barrier[6] = new Track(50).getTrackLength();
        barrier[7] = new Track(75).getTrackLength();
        barrier[8] = new Track(100).getTrackLength();
        barrier[9] = new Track(125).getTrackLength();

        Object[] entity = new Object[6];
        entity[0] = new Human();
        entity[1] = new Human();
        entity[2] = new Cat();
        entity[3] = new Cat();
        entity[4] = new Robot();
        entity[5] = new Robot();

//        for (Object o : entity) {
//            for (int i : barrier) {
//                if (o.getClass().getSimpleName().equals("Human")) {
//                    if ()
//                }
//            }
//        }
//        Run humanRuns = new Human();
//        Run catRuns = new Cat();
//        Run robotRuns = new Robot();
//
//        Jump humanJumping = new Human();
//        Jump catJumping = new Cat();
//        Jump robotJumping = new Robot();
//
//        humanRuns.run(track1.getTrackLength());
//        catRuns.run(track1.getTrackLength());
//        robotRuns.run(track1.getTrackLength());
//
//        humanJumping.jump(wall1.getWallHeight());
//        catJumping.jump(wall1.getWallHeight());
//        robotJumping.jump(wall1.getWallHeight());
    }
}
