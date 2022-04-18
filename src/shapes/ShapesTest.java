package shapes;


//----------EXERCISES FROM Inheritance and polymorphism KEPT TO USE AS REFERENCE------------

//public class ShapesTest {
//
//    public static void main(String[] args) {
//
////        ------------RECTANGLE WITH INSTANCE OF RECTANGLE-----------
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Box 1 Area: " + box1.getArea());
//        System.out.println("Box 1 Perim: " + box1.getPerimeter());
//
//
////          ------------RECTANGLE WITH INSTANCE OF SQUARE-----------
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 Area: " + box2.getPerimeter());
//        System.out.println("Box 2 Perim: " + box2.getArea());
//
////        ------------SQUARE TESTING "SIDE"-----------
//
//        Square square = new Square(3);
//        System.out.println("super square area: " + square.getArea());
//        System.out.println("super square perim: " + square.getPerimeter());
//    }
//}

//--------------------------------------------------------------------------



//----------------INTERFACES AND ABSTRACT CLASSES EXERCISES-----------------

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;
        Measurable myShape2;

        myShape = new Rectangle(5,10);
        myShape2 = new Square(2);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

    }
}
