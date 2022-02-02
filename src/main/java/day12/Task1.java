package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        System.out.println(cars);

        cars.add(3, "Mersedes");
        cars.remove(0);
        System.out.println(cars);
    }
}
