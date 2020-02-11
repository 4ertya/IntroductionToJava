import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("National Library", new ArrayList<>());
        library.addBook("Java. A beginner`s Guide", "Herbert Schildt", "Williams publishing",
                2017, 720, 60.00f, "hardcover");
        library.addBook("RICH DAD, POOR DAD", "Robert T. Kiyosaki", "Plata Publishing",
                2011, 350, 12.50f, "paperback");
        library.addBook("Maintenance manual BMW 5 series", null, "Grand",
                1997, 143, 0, "paperback");
        System.out.println("by Author: ");
       library.findByAuthor("Herbert Schildt");
        System.out.println("by publisher: ");
       library.findByPublisher("Grand");
        System.out.println("after year: ");
       library.findAfterYear(2000);
    }
}
