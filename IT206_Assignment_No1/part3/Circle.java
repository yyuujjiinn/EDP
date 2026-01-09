package IT206_Assignment_No1.part3;

public class Circle extends Shape implements Drawable{
    private final String shapeType="Circle";
    public Circle(String shapeType) {
        super(shapeType);
        
    }
    private double radius;
    private final double pi=3.14;
    @Override 
    double calculateArea() {
        double radius2= radius*radius;
        return pi*radius2;
    }
    @Override
    public void methodDraw() {
       System.out.println("@@@@@@@@@@\n" + //
                      "       @@@@@@@@@@@@@@@@@@\n" + //
                      "     @@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "    @@@@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "     @@@@@@@@@@@@@@@@@@@@@@\n" + //
                      "       @@@@@@@@@@@@@@@@@@\n" + //
                      "           @@@@@@@@@@");
    }
    
}
