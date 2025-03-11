class Book {
    public String ISBN;           
    protected String title;          
      private String author; 

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

  
    public String getAuthor() {
        return author;
    }


    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook
class EBook extends Book {
    private double fileSize;

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

   
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); 
        System.out.println("Title: " + title); 
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class 
public class LibrarySystem {
    public static void main(String[] args) {
      
        Book book1 = new Book("123-456-789", "Java Programming", "John Doe");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        System.out.println("\nAuthor (via getter): " + book1.getAuthor());

        book1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Author: " + book1.getAuthor());

        EBook ebook1 = new EBook("987-654-321", "Python Basics", "Alice Brown", 2.5);
        System.out.println("\n--- E-Book Details ---");
        ebook1.displayEBookDetails();
    }
}
