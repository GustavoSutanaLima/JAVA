public class Window {

    //fields (class's attributes)
    private int width;
    private int height;
    private String color;
    private int window = 0;

    //constructor (class initialization)
    public Window (int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //default getters and setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //other methods:
    public void openWindow(){
        System.out.println("The window is now opened!");
        this.window = 1;
    }
    public void closeWindow() {
        System.out.println("The window is now closed!");
        this.window = 0;
    }
    //window situation getter;
    public String getWindow() {
        if (this.window == 0) {
            return "Closed";
        }
        else {
            return "Opened";
        }
    }
}
