package hypermarket;

public class Pain extends Decor {

    private int volume;

    public Pain(int id, String name, double price) {
        super(id, name, price);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
