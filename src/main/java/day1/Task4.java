package day1;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        int year = 1980;
        while(i<=10){
            System.out.println("Олимпиада " + year + " года");
            i++;
            year = year+4;
        }
    }
}
