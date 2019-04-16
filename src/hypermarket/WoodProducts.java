package hypermarket;

public abstract class WoodProducts extends Product {

    private String material;

    public WoodProducts(int id, String name, double price) {
        super(id, name, price);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
