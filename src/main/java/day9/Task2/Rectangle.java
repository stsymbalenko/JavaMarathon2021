package day9.Task2;

public class Rectangle extends Figure{
    double width;
    double height;
    double S;
    double P;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        S = width*height;
        return S;
    }

    @Override
    public double perimeter() {
        P = (2*width)+(2*height);
        return P;
    }
}
