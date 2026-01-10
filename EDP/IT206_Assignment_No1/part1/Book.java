package IT206_Assignment_No1.part1;

public class Book {
    //creating attributes using protected to access subclass
    protected String title;
    protected String author;
    private float price;
    public Book(String title,String author,float price){//create constructor to initialize attributes
        this.title =title;
        this.author=author;
        this.price =price;

    }
    //encapsulate the information or attributes data
    public void setTitle(String title){
        this.title =title;
    }
    public void setAuthor (String author){
        this.author =author;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public float getPrice(){
        return this.price;
    }
    public void displayDetails(){
        System.out.println("Book Details ");
        System.out.println("Book Title : "+getTitle());
        System.out.println("Book Author : "+getAuthor());
        System.out.println("Book price : "+getPrice());
    }
    public float applyDiscount(float discount) {
        float discountAmount = price * (discount / 100);
        price -= discountAmount;
        return discountAmount;
    }


}
