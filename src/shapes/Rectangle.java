package shapes;


//----------EXERCISES FROM Inheritance and polymorphism KEPT TO USE AS REFERENCE------------

//public class Rectangle {


////    ---------PROPERTIES------------
//    protected int length;
//    protected int width;
//
////  ----------CONSTRUCTOR------------
//    public Rectangle(int lengthToSet, int widthToSet) {
//        this.length = lengthToSet;
//        this.width = widthToSet;
//    }
//
//    // --------GETTERS AND SETTERS--------
//
//    public int getArea() {
//        return this.length * this.width;
//
//    }
//
//    public int getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//}

//--------------------------------------------------------------------------


//------------INTERFACES AND ABSTRACT CLASSES EXERCISES---------------


public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public int setLength() {
        return super.length;
    }

    @Override
    public int setWidth() {
        return super.width;
    }
}

