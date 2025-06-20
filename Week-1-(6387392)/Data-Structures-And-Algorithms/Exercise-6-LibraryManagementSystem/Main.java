public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "Java Programming", "James Gosling"),
            new Book("B002", "Data Structures", "Mark Allen Weiss"),
            new Book("B003", "Operating Systems", "Andrew Tanenbaum"),
            new Book("B004", "Database Systems", "Elmasri & Navathe")
        };

        System.out.println("Linear Search for 'Data Structures':");
        Book foundLinear = SearchUtil.linearSearch(books, "Data Structures");
        System.out.println(foundLinear != null ? foundLinear : "Not Found");

        SearchUtil.sortBooksByTitle(books); // Must sort before binary search
        System.out.println("\nBinary Search for 'Data Structures':");
        Book foundBinary = SearchUtil.binarySearch(books, "Data Structures");
        System.out.println(foundBinary != null ? foundBinary : "Not Found");
    }
}
