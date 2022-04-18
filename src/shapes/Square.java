package shapes;

//----------EXERCISES FROM Inheritance and polymorphism KEPT TO USE AS REFERENCE------------

//public class Square extends Rectangle {
//
//
//
////    --------CONSTRUCTOR---------
//    public Square(int side) {
//        super(side,side);
//    }
//
////    ----------Override Methods---------
//    @Override
//    public int getArea() {
//        return (int) Math.pow(this.length,2);
//
//    }
//    @Override
//    public int getPerimeter() {
//        return 4 * super.length;
//    }
//}


public class Square extends Quadrilateral {

    public Square(int num) {
        super(num,num);
    }

    @Override
    public int setLength() {

        return this.length;
    }

    @Override
    public int setWidth() {

        return this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(this.length,2);
    }
}
