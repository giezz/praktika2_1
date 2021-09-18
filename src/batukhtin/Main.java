package batukhtin;

import batukhtin.entity.*;
import batukhtin.interfaces.Entity;
import batukhtin.interfaces.Obstacle;

public class Main {

    public static void main(String[] args) {

        Obstacle[] barriers = new Obstacle[10];
        barriers[0] = new Wall(10);
        barriers[1] = new Wall(20);
        barriers[2] = new Wall(30);
        barriers[3] = new Wall(40);
        barriers[4] = new Wall(50);
        barriers[5] = new Track(25);
        barriers[6] = new Track(50);
        barriers[7] = new Track(75);
        barriers[8] = new Track(100);
        barriers[9] = new Track(125);

        Entity[] entities = new Entity[6];
        entities[0] = new Human();
        entities[1] = new Human();
        entities[2] = new Cat();
        entities[3] = new Cat();
        entities[4] = new Robot();
        entities[5] = new Robot();

        for (Entity entity : entities) {
            for (Obstacle barrier : barriers) {
                if (barrier instanceof Wall) {
                    if (!entity.jump(barrier.getSize())) {
                        System.out.println(" \nnext entity\n");
                        break;
                    }
                }
                if (barrier instanceof Track) {
                    if (!entity.run(barrier.getSize())) {
                        System.out.println(" \nnext entity\n");
                        break;
                    }
                }
            }
        }
    }
}
