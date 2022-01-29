package day9.Task2;

public class Triangle extends Figure{
    double storona_1;
    double storona_2;
    double storona_3;
    double S;
    double P;

    public Triangle(int storona_1, int storona_2, int storona_3, String color) {
        super(color);
        this.storona_1 = storona_1;
        this.storona_2 = storona_2;
        this.storona_3 = storona_3;
    }

    @Override
    public double area() {
       double P2 = (storona_1 + storona_2 + storona_3)/2;
       S = Math.sqrt(P2 * (P2-storona_1) * (P2-storona_2) * (P2-storona_3));
        return S;
    }

    @Override
    public double perimeter() {
        P = (storona_1 + storona_2 + storona_3);
        return P;
    }
}
