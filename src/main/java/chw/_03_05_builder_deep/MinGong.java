package chw._03_05_builder_deep;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:16 2018/2/11
 * @Modified:
 */
public class MinGong implements Builder {
    private String window = "";
    private String floor = "";

    public MinGong() {
    }

    @Override
    public void makeWindow() {
        window = new String("window");
    }

    @Override
    public void makeFloor() {
        floor = new String("floor");
    }

    @Override
    public Room getRoom() {
        Room room = null;
        if (!window.equals("") && !floor.equals("")) {
            room = new Room();
            room.setFloor(floor);
            room.setWindow(window);
        }
        return room;
    }
}
