package hypermarket;

public class Floor extends WoodProducts {


    private int packageSize;

    public Floor(int id, String name, double price) {
        super(id, name, price);
    }

    public int getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

}
