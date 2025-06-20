public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T001", "Design UI", "Pending"));
        manager.addTask(new Task("T002", "Develop API", "In Progress"));
        manager.addTask(new Task("T003", "Testing", "Pending"));

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for T002:");
        Task t = manager.searchTask("T002");
        if (t != null) {
            System.out.println("Found: " + t);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting T001...");
        manager.deleteTask("T001");

        System.out.println("\nTasks after deletion:");
        manager.traverseTasks();
    }
}
