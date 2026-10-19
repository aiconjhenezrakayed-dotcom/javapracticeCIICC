public class Book {
    // 1. Private fields (Encapsulation)
    private String title;
    private double price;

    // 2. Constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // 3. Public Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // 4. A main method to test it
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", 49.99);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Price: $" + myBook.getPrice());
    }
}