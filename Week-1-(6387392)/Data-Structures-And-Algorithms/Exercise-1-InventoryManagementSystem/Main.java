public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Monitor", 50, 6999.99);
        Product p2 = new Product("P102", "Keyboard", 150, 999.99);
        Product p3 = new Product("P103", "Mouse", 200, 499.99);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.updateProduct("P102", "Mechanical Keyboard", 120, 1299.99);
        manager.deleteProduct("P103");

        manager.printInventory();
    }
}
