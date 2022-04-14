package shapes;

public class Rectangle {


//    ---------PROPERTIES------------
    protected int length;
    protected int width;

//  ----------CONSTRUCTOR------------
    public Rectangle(int lengthToSet, int widthToSet) {
        this.length = lengthToSet;
        this.width = widthToSet;
    }

    // --------GETTERS AND SETTERS--------

    public int getArea() {
        return this.length * this.width;

    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);

    }



}
