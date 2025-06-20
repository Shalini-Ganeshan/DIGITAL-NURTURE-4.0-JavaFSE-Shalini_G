import java.util.*;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product.getProductId() + " - " + product.getProductName() + " - " + product.getQuantity() + " units - ₹" + product.getPrice());
        }
    }
}
