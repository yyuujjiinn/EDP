package IT206_Assignment_No1.part3;

public class Circle extends Shape implements Drawable{
   
    private double radius;
    public Circle(double radius) {
        
        this.radius=radius;
        
    }
    
    private final double pi=3.14;
    @Override 
    public double calculateArea() {
        double radius2= radius*radius;
        return pi*radius2;
    }
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
