package Day4;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner=new Scanner(System.in);
    static void main() {
    HomeAreaCalculatorRedo home= new HomeAreaCalculatorRedo();

    Rectangle kitchen = home.getRoomDimentions();
    Rectangle bathroom = home.getRoomDimentions();
    double totalArea = home.calculateArea(kitchen,bathroom);


        System.out.println("the total area is :" + totalArea);
        home.scanner.close();
    }
   Rectangle getRoomDimentions(){

       System.out.println("enter room length");
       double length = scanner.nextDouble();
       System.out.println("enter room width");
       double width = scanner.nextDouble();

       return new Rectangle(length,width);
    }
    Double calculateArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
