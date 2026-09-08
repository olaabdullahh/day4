package Day4;

public class HomeAreaCalculator {
    static void main() {
        Rectangle room1=new Rectangle();
//        room1.length =20;
//        room1.width=10;
        room1.setLength(20);
        room1.setWidth(10);
        System.out.println(room1.calculateArea());

        Rectangle room2 =new Rectangle(30,20);
//        room2.length=10;
//        room2.width=5;
//        room2.setLength(10);
//        room2.setWidth(5);
        System.out.println(room2.calculateArea());
    }
}
