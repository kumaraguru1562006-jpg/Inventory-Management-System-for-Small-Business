public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addItem(new Product("P001", "Laptop", 10));
        inventory.addItem(new Product("P002", "Mouse", 50));

        inventory.displayItems();

        System.out.println("\nSearching Item: " + 
            (inventory.searchItem("P002") != null ? "Found" : "Not Found"));
    }
}