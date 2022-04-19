package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{


//    ---------PROPERTIES------------
    protected int length;
    protected int width;


//    --------CONSTRUCTOR---------

    public Quadrilateral(int num1, int num2){
        this.length = num1;
        this.width = num2;
    }

//    ----------GETTERS-------------

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

//    ----------ABSTRACT SETTERS------------

    public abstract int setLength();

    public abstract int setWidth();


//    abstract void setLength(int length);
//
//    abstract void setWidth(int width);


}
