package day9.Task2;

public class Circle extends Figure{
    double radius;

    double S;
    double P;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        S = Math.PI*Math.pow(radius, 2);
        return S;
    }

    @Override
    public double perimeter() {
        P= 2*Math.PI*radius;
        return P;
    }
}
