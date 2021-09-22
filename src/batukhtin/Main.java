package batukhtin;

import batukhtin.Enums.EnumObstacle;
import batukhtin.Enums.EnumWalls;
import batukhtin.entity.*;
import batukhtin.interfaces.Entity;

public class Main {

    public static void main(String[] args) {

//        Obstacle[] barriers = new Obstacle[] {
//                new Wall(10),
//                new Wall(20),
//                new Wall(30),
//                new Wall(40),
//                new Wall(50),
//                new Track(25),
//                new Track(50),
//                new Track(75),
//                new Track(100),
//                new Track(125)
//        };


        EnumObstacle[] obstacles = EnumObstacle.values();

        Entity[] entities = new Entity[] {
                new Human(),
                new Human(),
                new Cat(),
                new Cat(),
                new Robot(),
                new Robot()
        };

        for (Entity entity : entities) {

            if (entity instanceof Robot) {
                ((Robot) entity).superJump(EnumWalls.WALL1.getSize());
                ((Robot) entity).superJump(EnumWalls.WALL3.getSize());
                ((Robot) entity).superJump(EnumWalls.WALL5.getSize());
            } else {
                entity.jump(EnumWalls.WALL1.getSize());
                entity.jump(EnumWalls.WALL3.getSize());
                entity.jump(EnumWalls.WALL5.getSize());
            }
        }

//        for (Entity entity : entities) {
//            for (EnumObstacle o : obstacles) {
//                if (o.getType() == "wall") {
//                    if (!entity.jump(o.getSize())) {
//                        System.out.println(" \nnext entity\n");
//                        break;
//                    }
//                }
//
//                if (o.getType() == "track") {
//                    if (!entity.run(o.getSize())) {
//                        System.out.println(" \nnext entity\n");
//                        break;
//                    }
//                }
//            }
//        }
//        for (Entity entity : entities) {
//            for (Obstacle barrier : barriers) {
//                if (barrier instanceof Wall) {
//                    if (!entity.jump(barrier.getSize())) {
//                        System.out.println(" \nnext entity\n");
//                        break;
//                    }
//                }
//                if (barrier instanceof Track) {
//                    if (!entity.run(barrier.getSize())) {
//                        System.out.println(" \nnext entity\n");
//                        break;
//                    }
//                }
//            }
//        }
    }
}
