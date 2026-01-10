package IT206_Assignment_No1.src;
import IT206_Assignment_No1.part1.Book;
import IT206_Assignment_No1.part2.Ebook;
import IT206_Assignment_No1.part3.Circle;
import IT206_Assignment_No1.part3.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //creating objects lists
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        //flow
        while (true) {

            //Main menu option prompting
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("[1] Book Menu");
            System.out.println("[2] Shape Menu");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            String choice = in.nextLine();

            switch (choice) {

                // ================= BOOK MENU =================
                case "1":
                    while (true) {
                        System.out.println("\n=== BOOK MENU ===");
                        System.out.println("[1] Add Book / EBook");
                        System.out.println("[2] Display Books");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Enter option: ");
                        String bookOption = in.nextLine();

                        // ----- ADD BOOK -----
                        if (bookOption.equals("1")) {//when adding book
                            while (true) {
                                try {//options picking types of books
                                    System.out.println("\n--- ADD BOOK ---");
                                    System.out.println("[1] Book");
                                    System.out.println("[2] EBook");
                                    System.out.println("[0] Back");
                                    System.out.print("Choose type: ");
                                    String type = in.nextLine();

                                    if (type.equals("0")) break;
                                    //inputing details for book
                                    System.out.print("Title: ");
                                    String title = in.nextLine();

                                    System.out.print("Author: ");
                                    String author = in.nextLine();

                                        float price;
    do {
        System.out.print("Price: ");
        price = in.nextFloat();
        
        if (price < 0) {
            System.out.println("Invalid input! Price cannot be negative. Try again.");
        }
    } while (price < 0); // Keep asking as long as price is negative

                                    System.out.print("Discount (%): ");
                                    float discount = in.nextFloat();
                                    in.nextLine();

                                    Book b;//creating objects and defining whether ebook or normal book
                                    if (type.equals("1")) {
                                        b = new Book(title, author, price);
                                    } else {
                                        System.out.print("File Size (MB): ");
                                        int size = in.nextInt();
                                        in.nextLine();
                                        b = new Ebook(title, author, price, size);
                                    }

                                    System.out.println("\nOriginal Price: " + price);
                                    b.applyDiscount(discount);
                                    System.out.println("Discount: " + discount + "%");
                                    System.out.println("Final Price: " + b.getPrice());

                                    books.add(b);
                                    System.out.println("Book added successfully!");

                                    // after add options
                                    System.out.println("\n[1] Add another book");
                                    System.out.println("[2] Display books");
                                    System.out.println("[0] Back to Book Menu");
                                    System.out.print("Enter choice: ");
                                    String afterAdd = in.nextLine();
                                                            //displaying details book
                                    if (afterAdd.equals("2")) {
                                        for (Book bk : books) {
                                            System.out.println("----------------------------------");
                                            bk.displayDetails();
                                            System.out.println("----------------------------------");
                                            System.out.println();
                                        }
                                    }
                                    if (!afterAdd.equals("1")) break;

                                } catch (Exception e) {
                                    System.out.println("----------------------------------");
                                    System.out.println(" Invalid input. Please enter numbers correctly.");
                                    in.nextLine();
                                }
                            }
                        }

                        // ----- DISPLAY BOOKS -----
                        else if (bookOption.equals("2")) {
                            if (books.isEmpty()) {
                                System.out.println("📭 No books available.");
                            } else {
                                System.out.println("\n--- BOOK LIST ---");
                                for (Book b : books) {
                                    System.out.println("----------------------------------");
                                    b.displayDetails();
                                    System.out.println("----------------------------------");
                                }
                            }
                        }

                        else if (bookOption.equals("0")) break;
                    }
                    break;

                // ================= SHAPE MENU =================
                case "2":
                    while (true) {
                        System.out.println("\n=== SHAPE MENU ===");
                        System.out.println("[1] Add Shape");
                        System.out.println("[2] Display Shapes");
                        System.out.println("[3] Draw Shapes");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Enter option: ");
                        String shapeOption = in.nextLine();

                        // ----- ADD SHAPE -----
                        if (shapeOption.equals("1")) {
                            while (true) {
                                try {
                                    System.out.println("\n--- ADD SHAPE ---");
                                    System.out.println("[1] Circle");
                                    System.out.println("[2] Rectangle");
                                    System.out.println("[0] Back");
                                    System.out.print("Choose shape: ");
                                    String type = in.nextLine();

                                    if (type.equals("0")) break;

                                    if (type.equals("1")) {
                                        System.out.print("Radius: ");
                                        double r = in.nextDouble();
                                        in.nextLine();
                                        circles.add(new Circle(r));//adding object in circles list with computing area of a circle
                                        System.out.println(" Circle added successfully!");
                                    }
                                    else if (type.equals("2")) {
                                        System.out.print("Length: ");
                                        double l = in.nextDouble();
                                        System.out.print("Width: ");
                                        double w = in.nextDouble();
                                        in.nextLine();
                                        rectangles.add(new Rectangle(l, w));//creating object and calculate area of a rectangle
                                        System.out.println(" Rectangle added successfully!");
                                    }

                                    // after add options
                                    System.out.println("\n[1] Add another shape");
                                    System.out.println("[2] Display shapes");
                                    System.out.println("[0] Back to Shape Menu");
                                    System.out.print("Enter choice: ");
                                    String afterAdd = in.nextLine();

                                    if (afterAdd.equals("2")) {//displaying shapes
                                        for (Circle c : circles) {
                                            System.out.println("----------------------------------");
                                            c.displayDetails();
                                            System.out.println("----------------------------------");
                                        }
                                        for (Rectangle r : rectangles) {
                                            r.displayDetails();
                                            System.out.println();
                                        }
                                    }
                                    if (!afterAdd.equals("1")) break;

                                } catch (Exception e) {//handling error
                                    System.out.println("----------------------------------");
                                    System.out.println(" Invalid numeric input.");
                                    in.nextLine();
                                }
                            }
                        }

                        // ----- DISPLAY SHAPES -----
                        else if (shapeOption.equals("2")) {
                            if (circles.isEmpty() && rectangles.isEmpty()) {
                                System.out.println("----------------------------------");
                                System.out.println("No shapes available.");
                            } else {
                                for (Circle c : circles) {
                                    c.displayDetails();
                                    System.out.println();
                                }
                                for (Rectangle r : rectangles) {
                                    r.displayDetails();
                                    System.out.println();
                                }
                            }
                        }

                        // ----- DRAW SHAPES -----
                        else if (shapeOption.equals("3")) {
                            while (true) {
                                System.out.println("\n=== DRAW SHAPE ===");
                                System.out.println("[1] Draw Circles");
                                System.out.println("[2] Draw Rectangles");
                                System.out.println("[0] Back");
                                System.out.print("Choose option: ");
                                String drawOption = in.nextLine();

                                if (drawOption.equals("1")) {//draw shapes
                                    if (circles.isEmpty()) {
                                        System.out.println("----------------------------------");
                                        System.out.println("No circles to draw.");
                                    } else {
                                        for (Circle c : circles) {
                                            System.out.println("----------------------------------");
                                            c.methodDraw();
                                            System.out.println("----------------------------------");
                                        }
                                    }
                                }

                                else if (drawOption.equals("2")) {
                                    if (rectangles.isEmpty()) {
                                        System.out.println("----------------------------------");
                                        System.out.println("No rectangles to draw.");
                                    } else {
                                        for (Rectangle r : rectangles) {
                                            System.out.println("----------------------------------");
                                            r.methodDraw();
                                            System.out.println("----------------------------------");
                                        }
                                    }
                                }

                                else if (drawOption.equals("0")) {
                                    break;
                                }
                            }
                        }

                        else if (shapeOption.equals("0")) break;
                    }
                    break;

                case "0":
                    System.out.println("----------------------------------");
                    System.out.println("Program shutdown :(");
                    in.close();
                    return;

                default:
                    System.out.println("----------------------------------");
                    System.out.println("Invalid input.");
            }
        }
    }

}
