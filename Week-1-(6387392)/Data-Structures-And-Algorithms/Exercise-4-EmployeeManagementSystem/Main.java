public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E001", "Alice", "Developer", 60000));
        manager.addEmployee(new Employee("E002", "Bob", "Manager", 75000));
        manager.addEmployee(new Employee("E003", "Charlie", "Tester", 50000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for E002:");
        Employee e = manager.searchEmployee("E002");
        if (e != null) {
            System.out.println("Found: " + e);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting E001...");
        manager.deleteEmployee("E001");

        System.out.println("\nEmployees after deletion:");
        manager.traverseEmployees();
    }
}
