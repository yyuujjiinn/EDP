package IT206_Assignment_No1.part2;

import IT206_Assignment_No1.part1.Book;

//Inheritance
public class Ebook extends Book {
    //Unique Ebook Attribute
    private double fileSize;

    //Constructor
    public Ebook(String title, String author, float price, double fileSize) {
        //Calling the Parent method
        super(title, author, price);
        //Unique Data
        this.fileSize = fileSize;
    }
    //Setter
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    //Getter
    public double getFilesize() {
        return fileSize;
    }

    //Display Method
    @Override
    public void displayDetails() {
        System.out.println("EBook Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Original Price: " + getOriginalPrice());//Original Price Display
        System.out.println("Discounted Price: " + getPrice());//Discounted Price
        System.out.println("File Size : " + getFilesize());//File Size
    }
}