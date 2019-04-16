package hypermarket;

import java.util.ArrayList;

public class Filters {

    public static ArrayList<Product> getCheaper(ArrayList<Product> products, double neededPrice) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() <= neededPrice) {
                result.add(product);
            }
        }
        return result;
    }

    public static ArrayList<Product> getExpensive(ArrayList<Product> products, double neededPrice) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= neededPrice) {
                result.add(product);
            }
        }
        return result;
    }


}
