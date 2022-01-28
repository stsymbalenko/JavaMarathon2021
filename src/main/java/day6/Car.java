package day6;

public class Car {
    private String model;
    private String color;
    private int year;


    public String getModel() {
        return model;
    }

    public void setModel(String model_set) {
        model = model_set;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color_set) {
        color = color_set;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year_set) {
        year = year_set;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear-year);
    }
}
