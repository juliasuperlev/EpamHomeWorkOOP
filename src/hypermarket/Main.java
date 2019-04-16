package hypermarket;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> doorsList = new ArrayList<>();
        doorsList.add(new Door(1, "Rhodes", 250));
        doorsList.add(new Door(2, "Cleo", 400));
        doorsList.add(new Door(3, "Modern", 150.5));

        ArrayList<Product> cheaperProducts = Filters.getCheaper(doorsList, 300);

        for (Product product : cheaperProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

}
