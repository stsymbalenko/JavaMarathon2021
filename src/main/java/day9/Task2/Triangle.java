package day9.Task2;

public class Triangle extends Figure{
    private double storona1;
    private double storona2;
    private double storona3;

    public double getStorona1() {
        return storona1;
    }

    public double getStorona2() {
        return storona2;
    }

    public double getStorona3() {
        return storona3;
    }

    public Triangle(int storona1, int storona2, int storona3, String color) {
        super(color);
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public double area() {
       double P2 = (storona1 + storona2 + storona3)/2;
       return Math.sqrt(P2 * (P2-storona1) * (P2-storona2) * (P2-storona3));
    }

    @Override
    public double perimeter() {
        return storona1 + storona2 + storona3;
    }
}
