package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("BMV", 2000, 10, 2000);
        airplane.setYear(2003);
        airplane.setLength(15);

        airplane.fillUp(50);
        airplane.fillUp(10);

        airplane.info();
    }
}
