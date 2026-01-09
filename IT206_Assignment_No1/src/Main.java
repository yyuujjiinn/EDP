package IT206_Assignment_No1.src;
import IT206_Assignment_No1.part1.Book;
import IT206_Assignment_No1.part2.Ebook;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //details
        String choice ;
        String title,author;
        float price;
        //Books
        Book[] books=new Book[2];
        Ebook[] eBooks=new Ebook[2];
        
        System.out.println("");
        books[0] = new Book("Alamat ni Bakekang","Eugene Santos",1900);
        books[1] =new Book("Si Pagomng at Si Matsing","Ryan Bang", 2500);
        eBooks[0]= new Ebook("Naturally Cure Your Headaches", "Euugene Reyes",5000,500);
        eBooks[1]= new Ebook("The Child Wifes", "Euugene Reyes",5000,50);
        //Part 1 instantiate 2 Book class
    
     
      //Part 2 (Enscapsulation, Inheritance, and Polyp)
      // Creating Ebook and Book Lists
      Ebook e1=new Ebook("Naturally Cure Your Headaches", "Euugene Reyes",5000,500);
      //Ebook e2 = new Ebook("");
   
     

      //part 3

    }
}
