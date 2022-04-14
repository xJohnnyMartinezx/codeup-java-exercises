package shapes;

public class Square extends Rectangle {



//    --------CONSTRUCTOR---------
    public Square(int side) {
        super(side,side);
    }

//    ----------Override Methods---------
    @Override
    public int getArea() {
        return (int) Math.pow(this.length,2);

    }
    @Override
    public int getPerimeter() {
        return 4 * super.length;
    }
}
