class Book{
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);

        // Displaying book details
        book1.displayBookDetails();


        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();


        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();

        System.out.println("\nUpdated book details:");
        book1.displayBookDetails();
    }
}
