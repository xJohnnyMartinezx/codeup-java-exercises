package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("enter radius");

        double userRadius = input.getDouble();

        Circle circle = new Circle(userRadius);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }

}
