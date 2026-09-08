package Day4;

public class Rectangle {
   private double length;
   private double width;

   public Rectangle(){
       System.out.println("this is default constructor");
        length = 10;
        width=5;
   }
   public Rectangle(double length, double width){
       System.out.println("this is parameterized constructor");
       setWidth(width);
       this.length=length;
   }
   public void setLength(double length){
       this.length=length;
   }
   public void setWidth(double width){
       this.width=width;
   }

  public double getLength(){
       return length;
   }
  public double getWidth(){
       return width;
   }
    double calculateArea(){
        return length*width;
    }
    double calculatePerimeter(){
        return length*2+width*2;
    }
}
