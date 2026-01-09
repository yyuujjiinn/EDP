package IT206_Assignment_No1.part3;

public class Rectangle extends Shape implements Drawable{
    private final String shapetype= "Rectangle"; 
    public Rectangle(String shapeType) {
        super(shapeType);
        //TODO Auto-generated constructor stub
    }

    private double length;
    private double width;
    
    @Override
    double calculateArea() {
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
    
}
