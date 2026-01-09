package IT206_Assignment_No1.part3;

abstract class Shape {
  String shapetype;
  public Shape(String Shapetype){
    this.shapetype=shapetype;
  }
  abstract double calculateArea();
  public void displayShape(){
    if(this.shapetype.equalsIgnoreCase("Rectangle")){
      System.out.println("Shape Type : Rectangle ");
    }else {
      System.out.println("Shape Type : Circle");
    }
  }
}
