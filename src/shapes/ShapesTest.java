package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        ------------RECTANGLE WITH INSTANCE OF RECTANGLE-----------
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("Box 1 Area: " + box1.getArea());
        System.out.println("Box 1 Perim: " + box1.getPerimeter());


//          ------------RECTANGLE WITH INSTANCE OF SQUARE-----------

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 Area: " + box2.getPerimeter());
        System.out.println("Box 2 Perim: " + box2.getArea());

//        ------------SQUARE TESTING "SIDE"-----------

        Square square = new Square(3);
        System.out.println("super square area: " + square.getArea());
        System.out.println("super square perim: " + square.getPerimeter());

//        ------------SQUARE OVERRIDING OG RECTANGLE METHODS-----------
//        Square box3 = new Square(5);
//        System.out.println("Square class Area: " + box3.getArea());
//        System.out.println("Square class Perim: " + box3.getPerimeter());



    }



}
