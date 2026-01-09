package IT206_Assignment_No1.part3;

public class Rectangle extends Shape implements Drawable{
   
    private double width;
    private double length;

    public Rectangle(double length, double width) {

        this.length=length;
        this.width=width;
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public double calculateArea() {
      return length*width;
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
    public void displayDetails() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }

    @Override
    public void displayShapeType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
