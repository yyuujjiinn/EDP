package IT206_Assignment_No1.part3;

// Inherits from Shape, implements Drawable interface
public class Circle extends Shape implements Drawable{
   
    private double radius;

    // Constructor to set radius
    public Circle(double radius) {
        
        this.radius=radius;
        
    }
    // Constant value for PI
    private final double pi=3.14;
    @Override 
    public double calculateArea() {
        double radius2= radius*radius;
        return pi*radius2;// Returns Area = pi * r^2
    }
    // Define drawing logic from Interface
    @Override
    public void methodDraw() {
       System.out.println("           @@@@@@@@@@\n" + //
                      "       @@@@@@@@@@@@@@@@@@\n" + //
                      "     @@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "     @@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "       @@@@@@@@@@@@@@@@@@\n" + //
                      "           @@@@@@@@@@");
    }
    //Display Method
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