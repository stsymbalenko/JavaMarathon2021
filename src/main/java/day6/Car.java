package day6;

public class Car {
    private String model;
    private String color;
    private int year;


    public String getModel() {
        return model;
    }

    public void setModel(String modelSet) {
        model = modelSet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorSet) {
        color = colorSet;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearSet) {
        year = yearSet;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear-year);
    }
}
