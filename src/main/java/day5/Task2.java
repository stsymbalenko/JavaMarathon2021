package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();

        motorbike.setModel("Suzuki Bandit 500");
        motorbike.setColor("black");
        motorbike.setYear(2010);

        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());
    }
}
