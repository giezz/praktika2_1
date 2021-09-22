package batukhtin.Enums;

/**
 * Created by class on 22.09.2021.
 */
public enum EnumWalls {
    WALL1(10), WALL2(20), WALL3(30), WALL4(40), WALL5(50);

    private int size;

    EnumWalls(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
