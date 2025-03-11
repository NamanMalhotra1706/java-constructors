import java.util.Scanner;

public class Book{
    String bookTitle;
    String bookAuthor;
    int bookPrice;

    // default Constructor
    Book(){
        this.bookAuthor = "Amrita Rao";
        this.bookTitle = "The Couple of things";
        this.bookPrice = 500;
    }

    // parameterized constructors
    Book(String bookTitle, String bookAuthor, int bookPrice){
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookTitle = bookTitle;
    }

    // Functions to get book details
    public String getBookAuthor(){
        return "Book Author: " + bookAuthor;
    }

    public String getBookTitle(){
        return "Book title: " + bookTitle;
    }

    public int getBookPrice(){
        return bookPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 550);

        System.out.println(harryPotter.getBookTitle());
        System.out.println(harryPotter.getBookAuthor());
        System.out.println("Book Price: "+harryPotter.getBookPrice());

        System.out.println();
        Book defaultBook = new Book();
        System.out.println(defaultBook.getBookTitle());
        System.out.println(defaultBook.getBookAuthor());
        System.out.println(defaultBook.getBookPrice());

    }
}