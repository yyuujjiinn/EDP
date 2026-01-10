package IT206_Assignment_No1.part3;

import java.lang.reflect.Constructor;

// Inherits from Shape, implements Drawable interface
public class Rectangle extends Shape implements Drawable{
   
    private double width;
    private double length;

    // Constructor to set dimensions
    public Rectangle(double length, double width) {

        this.length=length;
        this.width=width;
    }

    
    @Override
    public double calculateArea() {
      return length*width;// Calculate area (l * w)
    }

    @Override
    public void methodDraw() {
       System.out.println("+--------------------------+\n" + //
                      "|                          |\n" + //
                      "|                          |\n" + //
                      "|                          |\n" + //
                      "|                          |\n" + //
                      "|                          |\n" + //
                      "+--------------------------+");
    }
    //Display Method
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