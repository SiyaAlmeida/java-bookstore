import java.util.Scanner;

// Book class represents the book being purchased
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


class Purchase {
    private Book book;
    private String customerEmail;
    private int quantity;

    
    public Purchase(Book book, String customerEmail, int quantity) {
        this.book = book;
        this.customerEmail = customerEmail;
        this.quantity = quantity;
    }

    
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public double getTotalPrice() {
        return book.getPrice() * quantity;
    }
}


class PurchaseService {

    public String processPurchase(Purchase purchase) {
        
        System.out.println("Processing purchase for: " + purchase.getCustomerEmail());
        System.out.println("Book: " + purchase.getBook().getTitle());
        System.out.println("Quantity: " + purchase.getQuantity());
        System.out.println("Total Price: " + purchase.getTotalPrice());

        
        return "Purchase successful!";
    }
}


public class PurchaseApplication {

    public static void main(String[] args) {
        
        Book book = new Book("Java Programming", "John Doe", 29.99);

        
        PurchaseService purchaseService = new PurchaseService();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        
        System.out.println("Enter the quantity of the book you want to purchase:");
        int quantity = scanner.nextInt();

    
        Purchase purchase = new Purchase(book, email, quantity);

        
        String message = purchaseService.processPurchase(purchase);

        
        System.out.println(message);

        
        scanner.close();
    }
}