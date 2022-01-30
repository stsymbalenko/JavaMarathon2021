package day9.Task2;

public class TestFigures {
    private static double sumP;
    private static double sumS;

    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter( figures));
        System.out.println(calculateRedArea( figures));


    }

    public static double calculateRedPerimeter(Figure[] figures) {
        for (Figure figure: figures){
            if ("RED".equals(figure.getColor())){
                sumP = sumP + figure.perimeter();
            }
        }
        return sumP;
    }

    public static double calculateRedArea(Figure[] figures) {
        for (Figure figure: figures){
            if (figure.color.equals("Red")){
                sumS = sumS + figure.area();
            }
        }
        return sumS;
    }

}
