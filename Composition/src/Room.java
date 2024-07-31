public class Room {
    //fields;
    private Window thisRoomsWindow;
    private Door thisRoomsDoor;
    private PC thisRoomsPC;
    private int width;
    private int depth;
    private int length;
    private String colorsOfTheWalls;
    private int light = 0;

    //constructor

    public Room(Window thisRoomsWindow, Door thisRoomsDoor, PC thisRoomsPC, int width, int depth, int length, String colorsOfTheWalls) {
        this.thisRoomsWindow = thisRoomsWindow;
        this.thisRoomsDoor = thisRoomsDoor;
        this.thisRoomsPC = thisRoomsPC;
        this.width = width;
        this.depth = depth;
        this.length = length;
        this.colorsOfTheWalls = colorsOfTheWalls;
    }

    //default getters and setters

    public Window getThisRoomsWindow() {
        return thisRoomsWindow;
    }

    public void setThisRoomsWindow(Window thisRoomsWindow) {
        this.thisRoomsWindow = thisRoomsWindow;
    }

    public Door getThisRoomsDoor() {
        return thisRoomsDoor;
    }

    public void setThisRoomsDoor(Door thisRoomsDoor) {
        this.thisRoomsDoor = thisRoomsDoor;
    }

    public PC getThisRoomsPC() {
        return thisRoomsPC;
    }

    public void setThisRoomsPC(PC thisRoomsPC) {
        this.thisRoomsPC = thisRoomsPC;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColorsOfTheWalls() {
        return colorsOfTheWalls;
    }

    public void setColorsOfTheWalls(String colorsOfTheWalls) {
        this.colorsOfTheWalls = colorsOfTheWalls;
    }

    //other methods;
    public void turnLightsOnAndOff() {
         //means the light is on, zero means light is off;
        if (this.light == 1) {
            this.light = 0;
        }
        else {
            this.light = 1;
        }
    }
    //light's method getter
    public int getLights() {
        return this.light;
    }

    //open and close window methods;
    public void openWindow () {
        thisRoomsWindow.openWindow();
    }
}
