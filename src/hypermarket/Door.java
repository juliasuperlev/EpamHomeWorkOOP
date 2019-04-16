package hypermarket;

public class Door extends WoodProducts {

    private double height;

    private double width;

    public Door(int id, String name, double price) {
        super(id, name, price);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
