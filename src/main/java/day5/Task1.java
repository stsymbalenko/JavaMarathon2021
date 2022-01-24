package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mazda 6");
        car.setColor("blue");
        car.setYear(2012);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}
