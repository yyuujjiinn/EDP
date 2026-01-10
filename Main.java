package IT206_Assignment_No1.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Creating objects lists
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Flow
        while (true) {
            // Main menu option prompting
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
                        if (bookOption.equals("1")) {
                            while (true) {
                                try {
                                    System.out.println("\n--- ADD BOOK ---");
                                    System.out.println("[1] Book");
                                    System.out.println("[2] EBook");
                                    System.out.println("[0] Back");
                                    System.out.print("Choose type: ");
                                    String type = in.nextLine();

                                    if (type.equals("0")) break;

                                    // Inputing details for book
                                    System.out.println();
                                    System.out.print("Title: ");
                                    String title = in.nextLine();

                                    System.out.print("Author: ");
                                    String author = in.nextLine();

                                    float price;
                                    do {
                                        System.out.print("Price: PHP");
                                        price = in.nextFloat();

                                        if (price < 0) {
                                            System.out.println("Invalid input! Price cannot be negative. Try again.");
                                        }
                                    } while (price < 0);

                                   float discount;
                                    do {
                                    System.out.print("Discount (%): ");
                                    discount = in.nextFloat();
                                    
                                    // Check if it's too high OR too low
                                    if (discount < 1 || discount > 100) {
                                        System.out.println("Invalid input! Discount must be between 1 and 100.");
                                    }
                                } while (discount < 1 || discount > 100);

                                in.nextLine(); // Consume newline after valid number

                                    Book b; // creating objects and defining whether ebook or normal book
                                    if (type.equals("1")) {
                                        b = new Book(title, author, price);
                                    }  else {
                                        double size;
                                        do {
                                            System.out.print("File Size (MB): ");
                                            size = in.nextDouble();
                                            
                                            if (size < 0) {
                                                System.out.println("Invalid input! File size cannot be negative. Try again.");
                                            }
                                        } while (size < 0);

                                        in.nextLine(); // Consume newline
                                        b = new Ebook(title, author, price, size);
                                    }

                                    System.out.println("\nOriginal Price: PHP" + price);
                                    b.applyDiscount(discount);
                                    System.out.println("Discount: " + discount + "%");
                                    System.out.println("Final Price: PHP" + b.getPrice());

                                    books.add(b);
                                    System.out.println("Book added successfully!");

                                    // After add options
                                    System.out.println("\n[1] Add another book");
                                    System.out.println("[2] Display books");
                                    System.out.println("[0] Back to Book Menu");
                                    System.out.print("Enter choice: ");
                                    String afterAdd = in.nextLine();

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
                                    in.nextLine(); // Clear scanner buffer
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
                        } else if (bookOption.equals("0")) break;
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
                                        double r;
                                        do {
                                            System.out.print("Radius: ");
                                            r = in.nextDouble();
                                            if (r < 0) {
                                                System.out.println("Invalid input! Radius cannot be negative.");
                                            }
                                        } while (r < 0);
                                        in.nextLine();
                                        circles.add(new Circle(r));
                                        System.out.println("Circle added successfully!");

                                    } else if (type.equals("2")) {
                                        double l;
                                        do {
                                            System.out.print("Length: ");
                                            l = in.nextDouble();
                                            if (l < 0) {
                                                System.out.println("Invalid input! Length cannot be negative.");
                                            }
                                        } while (l < 0);
                                        double w;
                                        do {
                                            System.out.print("Width: ");
                                            w = in.nextDouble();
                                            if (w < 0) {
                                                System.out.println("Invalid input! Width cannot be negative.");
                                            }
                                        } while (w < 0);
                                        in.nextLine();
                                        rectangles.add(new Rectangle(l, w));
                                        System.out.println("Rectangle added successfully!");
                                    }

                                    // After add options
                                    System.out.println("\n[1] Add another shape");
                                    System.out.println("[2] Display shapes");
                                    System.out.println("[0] Back to Shape Menu");
                                    System.out.print("Enter choice: ");
                                    String afterAdd = in.nextLine();

                                    if (afterAdd.equals("2")) {
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

                                } catch (Exception e) {
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

                                if (drawOption.equals("1")) {
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
                                } else if (drawOption.equals("2")) {
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
                                } else if (drawOption.equals("0")) {
                                    break;
                                }
                            }
                        } else if (shapeOption.equals("0")) break;
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

class Book {
    // Attributes
    protected String title;
    protected String author;

    // Encapsulation
    private float price;
    private float originalPrice;

    // Constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.originalPrice = price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public float getOriginalPrice() {
        return this.originalPrice;
    }

    // Display Method
    public void displayDetails() {
        System.out.println("Book Details ");
        System.out.println("Book Title : " + getTitle());
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Original Book Price: PHP" + originalPrice);
        System.out.println("Discounted Book price : PHP" + getPrice());
    }

    // Final Price Calculation
    public float applyDiscount(float discount) {
        float discountAmount = price * (discount / 100);
        price -= discountAmount;
        return discountAmount;
    }
}

class Ebook extends Book {
    // Unique Ebook Attribute
    private double fileSize;

    // Constructor
    public Ebook(String title, String author, float price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    // Setter
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Getter
    public double getFilesize() {
        return fileSize;
    }

    // Display Method
    @Override
    public void displayDetails() {
        System.out.println("E-Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Original Price: PHP" + getOriginalPrice());
        System.out.println("Discounted Price: PHP" + getPrice());
        System.out.println("File Size : " + getFilesize() + " MB");
    }
}

class Circle extends Shape implements Drawable {

    private double radius;
    private final double pi = 3.14;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double radius2 = radius * radius;
        return pi * radius2;
    }

    // Define drawing logic from Interface
    @Override
    public void methodDraw() {
        System.out.println("          @@@@@@@@@@\n" +
                "      @@@@@@@@@@@@@@@@@@\n" +
                "    @@@@@@@@@@@@@@@@@@@@@@\n" +
                "   @@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "   @@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "   @@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "    @@@@@@@@@@@@@@@@@@@@@@\n" +
                "      @@@@@@@@@@@@@@@@@@\n" +
                "          @@@@@@@@@@");
    }

    // Display Method
    public void displayDetails() {
        displayShapeType();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    @Override
    public void displayShapeType() {
        System.out.println("Shape type: Circle");
    }
}

interface Drawable {
    void methodDraw();
}

// Inherits from Shape, implements Drawable interface
class Rectangle extends Shape implements Drawable {

    private double width;
    private double length;

    // Constructor to set dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void methodDraw() {
        System.out.println("+--------------------------+\n" +
                "|                          |\n" +
                "|                          |\n" +
                "|                          |\n" +
                "|                          |\n" +
                "|                          |\n" +
                "+--------------------------+");
    }

    // Display Method
    public void displayDetails() {
        displayShapeType();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }

    @Override
    public void displayShapeType() {
        System.out.println("Shape type: Rectangle");
    }
}

abstract class Shape {
    public abstract double calculateArea();

    public abstract void displayShapeType();
}
