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

        for (Object o : entity) {
            for (int j = 0; j < barrier.length; j++) {
                if (j < 5) {
                    if (o.getClass().getSimpleName().equals("Human")) {
                        if (((Human) o).maxRunDistance < barrier[j]) break;
                        else ((Human) o).run(barrier[j]);
                    }
                    if (o.getClass().getSimpleName().equals("Cat")) {
                        if (((Cat) o).maxRunDistance < barrier[j]) break;
                        else ((Cat) o).run(barrier[j]);
                    }
                    if (o.getClass().getSimpleName().equals("Robot")) {
                        if (((Robot) o).maxRunDistance < barrier[j]) break;
                        else ((Robot) o).run(barrier[j]);
                    }
                }
                else {
                    if (o.getClass().getSimpleName().equals("Human")) {
                        ((Human) o).jump(barrier[j]);
                    }
                    if (o.getClass().getSimpleName().equals("Cat")) {
                        ((Cat) o).jump(barrier[j]);
                    }
                    if (o.getClass().getSimpleName().equals("Robot")) {
                        ((Robot) o).jump(barrier[j]);
                    }
                }
            }
        }
    }
}
