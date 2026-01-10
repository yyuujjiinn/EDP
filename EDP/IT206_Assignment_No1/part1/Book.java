package IT206_Assignment_No1.part1;

public class Book {
    // Attributes
    // 'protected' allows subclasses (like Ebook) to access these directly
    protected String title;
    protected String author;

    //Application of Encapsulation
    private float price;
    private float originalPrice;//Variable to hold the Original Price

    //Constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.originalPrice = price; 
    }

    //Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(float price) { this.price = price; }

    //Getters
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public float getPrice() { return this.price; }
    public float getOriginalPrice() {
        return this.originalPrice;
    }

    //Display Method
    public void displayDetails() {
        System.out.println("Book Details ");
        System.out.println("Book Title : " + getTitle());
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Original Boook Price: " + originalPrice);//Original Price Display
        System.out.println("Book price : " + getPrice());//Discounted Price
    }

    //Final Price Calculation
    public float applyDiscount(float discount) {
        float discountAmount = price * (discount / 100);
        price -= discountAmount;
        return discountAmount;
    }
}