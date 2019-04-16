package hypermarket;

public abstract class Decor extends Product {

    private String type;

    public Decor(int id, String name, double price) {
        super(id, name, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
