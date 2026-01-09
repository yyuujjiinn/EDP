package IT206_Assignment_No1.part2;

import IT206_Assignment_No1.part1.Book;

public class Ebook extends Book {
    private double fileSize;
     public Ebook(String title, String author, float price,double fileSize) {
        super(title, author, price);
        this.fileSize=fileSize;
    }
    public void setFileSize(double fileSize){
        this.fileSize=fileSize;
    }
    public double getFilesize(){
        return fileSize;
    }
    public void displayDetails(){
         System.out.println("EBook Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + getPrice());
        System.out.println("File Size : "+getFilesize());
    }
}
