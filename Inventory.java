import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        items.add(item);
    }

    public Product searchItem(String id) {
        for (Product item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void displayItems() {
        System.out.println("Inventory List:");
        for (Product item : items) {
            System.out.println(item);
        }
    }
}