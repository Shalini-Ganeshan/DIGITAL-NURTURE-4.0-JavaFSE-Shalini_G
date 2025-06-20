import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Camera", "Electronics"),
            new Product("P003", "Shoes", "Fashion"),
            new Product("P004", "Watch", "Fashion"),
            new Product("P005", "Phone", "Electronics")
        };

        Product result1 = SearchUtil.linearSearch(products, "Shoes");
        if (result1 != null) {
            System.out.println("Linear Search: Found " + result1.getProductName());
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
        Product result2 = SearchUtil.binarySearch(products, "Shoes");
        if (result2 != null) {
            System.out.println("Binary Search: Found " + result2.getProductName());
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
