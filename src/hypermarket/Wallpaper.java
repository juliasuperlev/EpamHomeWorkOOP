package hypermarket;

public class Wallpaper extends Decor {

    private double metersInRoll;

    public Wallpaper(int id, String name, double price) {
        super(id, name, price);
    }

    public double getMetersInRoll() {
        return metersInRoll;
    }

    public void setMetersInRoll(double metersInRoll) {
        this.metersInRoll = metersInRoll;
    }
}
