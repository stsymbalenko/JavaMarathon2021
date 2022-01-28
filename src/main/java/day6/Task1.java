package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mazda 6");
        car.setColor("blue");
        car.setYear(1980);

        Motorbike motorbike = new Motorbike("Suzuki Bandit 500", "black", 2010);


        car.info();
        System.out.println(car.yearDifference(2040));

        motorbike.info();
        System.out.println(motorbike.yearDifference(2018));
    }
}
