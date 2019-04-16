package hypermarket;

public abstract class Plumbing extends Product {

    private String material;

    public Plumbing(int id, String name, double price, String material) {
        super(id, name, price);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
