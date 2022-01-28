package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2000, 150, 2000);
        Airplane airplane2 = new Airplane("Mriya", 1995, 300, 4000);

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}