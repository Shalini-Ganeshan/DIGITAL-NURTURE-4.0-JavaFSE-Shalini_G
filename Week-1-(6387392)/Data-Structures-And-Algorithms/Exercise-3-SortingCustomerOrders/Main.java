public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 3500.0),
            new Order("O102", "Bob", 2200.0),
            new Order("O103", "Charlie", 5000.0),
            new Order("O104", "Daisy", 1200.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        SortUtil.bubbleSort(orders);
        System.out.println("\nSorted by Bubble Sort:");
        printOrders(orders);

        Order[] orders2 = {
            new Order("O101", "Alice", 3500.0),
            new Order("O102", "Bob", 2200.0),
            new Order("O103", "Charlie", 5000.0),
            new Order("O104", "Daisy", 1200.0)
        };

        SortUtil.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nSorted by Quick Sort:");
        printOrders(orders2);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
