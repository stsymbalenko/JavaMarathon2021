package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "0";
        for( int i = 1; i <=2000; i++){
            str = str + " " + i;
        }
        System.out.println(str);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i <=2000; i++){
            stringBuilder.append(i + " ");
        }
        System.out.println(stringBuilder);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}
