package batukhtin.Enums;

/**
 * Created by class on 22.09.2021.
 */
public enum EnumObstacle {

    OBSTACLE1(10, "wall"), OBSTACLE2(20, "wall"), OBSTACLE3(30, "wall"), OBSTACLE4(40, "wall"), OBSTACLE5(50, "wall"),
    OBSTACLE6(25, "track"), OBSTACLE7(50, "track"), OBSTACLE8(75, "track"), OBSTACLE9(100, "track"), OBSTACLE10(125, "track");

    private int size;
    private String type;

    EnumObstacle(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
