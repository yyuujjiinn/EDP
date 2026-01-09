package IT206_Assignment_No1.src;
import IT206_Assignment_No1.part1.Book;
import IT206_Assignment_No1.part2.Ebook;
import IT206_Assignment_No1.part3.Circle;
import IT206_Assignment_No1.part3.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Circle> circles = new ArrayList<>();
    ArrayList<Rectangle> rectangles = new ArrayList<>();

    String choice;



    while (true) {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("[1]- Book Menu");
        System.out.println("[2] - Shape Menu");
        System.out.println("[0] - Exit");
        System.out.print("Enter choice: ");
        choice = in.nextLine();

        switch (choice) {

            // ================= BOOK MENU =================
            case "1":
                String title, author;
                float price;
                System.out.println("\n1 - Add Book / EBook");
                System.out.println("2 - Display Books");
                System.out.print("Enter option: ");
                String bookOption = in.nextLine();

                if (bookOption.equals("1")) {
                    System.out.print("Type (1 = Book, 2 = EBook): ");
                    String type = in.nextLine();

                    if (type.equals("1")) {
                        System.out.print("Title: ");
                        title = in.nextLine();

                        System.out.print("Author: ");
                        author = in.nextLine();

                        System.out.print("Price: ");
                        price = in.nextFloat();
                        in.nextLine();
                        books.add(new Book(title, author, price));
                    } 
                    else if (type.equals("2")) {
                        System.out.print("Title: ");
                        title = in.nextLine();

                        System.out.print("Author: ");
                        author = in.nextLine();

                        System.out.print("Price: ");
                        price = in.nextFloat();
                        in.nextLine();
                        System.out.print("File Size (MB): ");
                        int size = in.nextInt();
                        in.nextLine();
                        Ebook e=new Ebook(title, author, price, size);
                        books.add(e);
                    }
                }

                else if (bookOption.equals("2")) {
                    if(books.size()==0){
                        System.out.println();
                        System.out.println("Books Empty");
                    }
                    else{
                        System.out.println("\n--- BOOK LIST ---");
                        for (Book b : books) {
                            b.displayDetails();
                            System.out.println();
                        }
                    }

                }
                break;

            // ================= SHAPE MENU =================
            case "2":
                System.out.println("\n1 - Add Shape");
                System.out.println("2 - Display Shapes");
                System.out.print("Enter option: ");
                String shapeOption = in.nextLine();

                if (shapeOption.equals("1")) {
                    System.out.println("1 - Circle");
                    System.out.println("2 - Rectangle");
                    System.out.print("Choose shape: ");
                    String type = in.nextLine();

                    if (type.equals("1")) {
                        System.out.print("Radius: ");
                        double r = in.nextDouble();
                        in.nextLine();
                        circles.add(new Circle(r));
                    }

                    else if (type.equals("2")) {
                        System.out.print("Length: ");
                        double l = in.nextDouble();
                        System.out.print("Width: ");
                        double w = in.nextDouble();
                        in.nextLine();
                        rectangles.add(new Rectangle(l, w));
                    }
                }

                else if (shapeOption.equals("2")) {
                    if(circles.size()==0 && rectangles.size() ==0){
                        System.out.println();
                        System.out.println("------------------Empty Shapes---------------");
                    }else{
                        System.out.println("\n--- CIRCLES ---");
                        for (Circle c : circles) {
                            c.displayDetails();
                            c.methodDraw();
                            System.out.println();
                        }

                        System.out.println("\n--- RECTANGLES ---");
                        for (Rectangle r : rectangles) {
                            r.displayDetails();
                            r.methodDraw();
                            System.out.println();
                        }
                    }

                }
                break;

            case "0":
                System.out.println("Program shutdown   :(");
                in.close();
                return;

            default:
                System.out.println("Invalid input. Please try again.");
        }
    }
}
}