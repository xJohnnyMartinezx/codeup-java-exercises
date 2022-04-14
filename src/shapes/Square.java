package shapes;

public class Square extends Rectangle {

    protected int side;

//    --------CONSTRUCTOR---------
    public Square(int side) {
        super(side,side);
        this.side = side;
    }

//    ----------Override Methods---------
    @Override
    public int getArea() {
        return (int) Math.pow(side,2);

    }
    @Override
    public int getPerimeter() {
//        System.out.println(side);
        return 4 * side;



    }






}
